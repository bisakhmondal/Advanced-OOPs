def ServerDesc(*args,**kwargs):
    print(args[0]['name'])
    for key, val in kwargs.items():
        print("\nServer",key)
        print("Name: ", val['name'])
        print("IP: ",val['IP'])
        print("Open port: ", val['port'])
    print('-'*30)

serverList={
    's1':{
        'name':'APACHE2',
        'IP':'32.40.1.12',
        'port':'443'
    },
    's2':{
        'name':'NGINX',
        'IP':'132.45.1.12',
        'port':'80'
    }
}
if __name__=="__main__":
    ServerDesc(serverList['s1'],**serverList)
    
