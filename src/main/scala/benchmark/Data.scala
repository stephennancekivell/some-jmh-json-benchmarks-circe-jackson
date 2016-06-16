package benchmark

object Data {
  case class Friend(id: Int, name: String)
  case class Type(
  `_id`: String,
  `index`: Int,
  `guid`: String,
  `isActive`: Boolean,
  `balance`: String,
  `picture`: String,
  `age`: Int,
  `eyeColor`: String,
  `name`: String,
  `gender`: String,
  `company`: String,
  `email`: String,
  `phone`: String,
  `address`: String,
  `about`: String,
  `registered`: String,
  `latitude`: Double,
  `longitude`: Double,
  `tags`: Seq[String],
  `friends`: Seq[Friend],
  `greeting`: String,
  `favoriteFruit`: String)


  val json =
    """
      |[
      |  {
      |    "_id": "576278df40bd978bc65ddb06",
      |    "index": 0,
      |    "guid": "e4c30481-84f3-4193-a83c-fe0435348774",
      |    "isActive": true,
      |    "balance": "$1,355.27",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 26,
      |    "eyeColor": "green",
      |    "name": "Stewart Navarro",
      |    "gender": "male",
      |    "company": "NORSUP",
      |    "email": "stewartnavarro@norsup.com",
      |    "phone": "+1 (916) 543-2895",
      |    "address": "133 Stillwell Place, Richford, Wyoming, 2001",
      |    "about": "Eiusmod excepteur do esse minim nisi occaecat enim non dolor labore ipsum ut. Fugiat deserunt est pariatur pariatur. Laboris aute cillum tempor in exercitation laboris laboris fugiat velit enim ut ad. Ea labore commodo consectetur ut anim anim sint consectetur commodo.\r\n",
      |    "registered": "2015-05-01T05:24:06 -10:00",
      |    "latitude": -29.132033,
      |    "longitude": -58.249295,
      |    "tags": [
      |      "sunt",
      |      "Lorem",
      |      "adipisicing",
      |      "duis",
      |      "nulla",
      |      "sint",
      |      "fugiat"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Yates Pruitt"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Chen Henry"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Miranda Vincent"
      |      }
      |    ],
      |    "greeting": "Hello, Stewart Navarro! You have 7 unread messages.",
      |    "favoriteFruit": "strawberry"
      |  },
      |  {
      |    "_id": "576278df1e613c05be4913bc",
      |    "index": 1,
      |    "guid": "8a7872cd-7b0d-4433-93e4-1dd96ee47ae0",
      |    "isActive": true,
      |    "balance": "$3,735.80",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 36,
      |    "eyeColor": "green",
      |    "name": "Mcintyre Blackwell",
      |    "gender": "male",
      |    "company": "THREDZ",
      |    "email": "mcintyreblackwell@thredz.com",
      |    "phone": "+1 (901) 510-2902",
      |    "address": "182 Newton Street, Worton, Oklahoma, 7052",
      |    "about": "Ut et Lorem quis dolor velit amet dolore. Anim aute quis occaecat non. Laborum reprehenderit dolor non ipsum. Do irure irure amet ullamco deserunt fugiat.\r\n",
      |    "registered": "2015-09-19T10:25:51 -10:00",
      |    "latitude": 55.523497,
      |    "longitude": -130.990294,
      |    "tags": [
      |      "consequat",
      |      "tempor",
      |      "magna",
      |      "tempor",
      |      "amet",
      |      "sit",
      |      "magna"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Annette Savage"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Vicki Lucas"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Ford Russell"
      |      }
      |    ],
      |    "greeting": "Hello, Mcintyre Blackwell! You have 1 unread messages.",
      |    "favoriteFruit": "strawberry"
      |  },
      |  {
      |    "_id": "576278dfa97c27ffe2931e5b",
      |    "index": 2,
      |    "guid": "c885c3c5-b38e-4404-9221-3e7a33a8fe69",
      |    "isActive": true,
      |    "balance": "$1,305.20",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 40,
      |    "eyeColor": "green",
      |    "name": "Estrada Cote",
      |    "gender": "male",
      |    "company": "ZENTHALL",
      |    "email": "estradacote@zenthall.com",
      |    "phone": "+1 (973) 572-2568",
      |    "address": "279 Turner Place, Martell, Arkansas, 1400",
      |    "about": "Irure amet in ex do id amet dolor do tempor nisi minim. Voluptate minim est et tempor aliqua enim labore id dolor exercitation ad ullamco in aute. Aute ut velit quis incididunt laborum voluptate id culpa est adipisicing consequat aliqua sit. Veniam ullamco officia fugiat consequat aute proident culpa in commodo culpa adipisicing incididunt elit. Dolore deserunt officia et officia veniam.\r\n",
      |    "registered": "2014-12-23T11:13:41 -11:00",
      |    "latitude": -46.271383,
      |    "longitude": -158.938727,
      |    "tags": [
      |      "ut",
      |      "qui",
      |      "cillum",
      |      "consectetur",
      |      "esse",
      |      "incididunt",
      |      "sint"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Velez Mclean"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Alicia Vaughan"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Tommie Calhoun"
      |      }
      |    ],
      |    "greeting": "Hello, Estrada Cote! You have 7 unread messages.",
      |    "favoriteFruit": "strawberry"
      |  },
      |  {
      |    "_id": "576278dffe93143e102bd3e7",
      |    "index": 3,
      |    "guid": "71ca4374-f944-4430-9bc2-227daac0cbc8",
      |    "isActive": true,
      |    "balance": "$3,520.51",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 30,
      |    "eyeColor": "blue",
      |    "name": "Marlene Aguirre",
      |    "gender": "female",
      |    "company": "SLAX",
      |    "email": "marleneaguirre@slax.com",
      |    "phone": "+1 (848) 518-2499",
      |    "address": "514 Beekman Place, Vaughn, Georgia, 4574",
      |    "about": "Officia eu in reprehenderit laboris minim exercitation irure exercitation adipisicing minim. Voluptate tempor culpa ad ea eu qui quis id consectetur eiusmod amet pariatur enim. Ipsum veniam magna excepteur amet tempor tempor id id tempor officia incididunt aliqua amet ullamco. Officia in et anim ad exercitation duis officia. Aliqua consectetur anim labore sint velit dolor laboris officia. Elit proident mollit eiusmod nulla quis non laboris voluptate ut ea culpa enim. Sunt deserunt proident officia sunt.\r\n",
      |    "registered": "2014-01-18T03:10:40 -11:00",
      |    "latitude": 55.403223,
      |    "longitude": 105.92773,
      |    "tags": [
      |      "irure",
      |      "sint",
      |      "eiusmod",
      |      "do",
      |      "enim",
      |      "dolore",
      |      "dolor"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Mara Richards"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Kathrine Curtis"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Suzanne Macias"
      |      }
      |    ],
      |    "greeting": "Hello, Marlene Aguirre! You have 7 unread messages.",
      |    "favoriteFruit": "apple"
      |  },
      |  {
      |    "_id": "576278df1caadb43c1744ad5",
      |    "index": 4,
      |    "guid": "05fa3c8a-8ae9-407c-8b6c-1e367b31ce5c",
      |    "isActive": true,
      |    "balance": "$3,795.51",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 32,
      |    "eyeColor": "blue",
      |    "name": "Petty Black",
      |    "gender": "male",
      |    "company": "LUXURIA",
      |    "email": "pettyblack@luxuria.com",
      |    "phone": "+1 (910) 490-2506",
      |    "address": "876 Kay Court, Roberts, Federated States Of Micronesia, 3652",
      |    "about": "In anim ad quis duis est. Lorem dolor Lorem sunt nulla fugiat eu est minim. Officia nostrud et ut Lorem occaecat aliquip eu est. Ea laboris est elit veniam enim esse ipsum incididunt cupidatat reprehenderit non. Fugiat proident in officia do eu Lorem excepteur cupidatat deserunt. Amet laboris ad magna aliquip amet dolore excepteur ea voluptate aliquip. Commodo sit commodo quis nulla non elit do ullamco deserunt laborum deserunt.\r\n",
      |    "registered": "2014-01-06T07:42:28 -11:00",
      |    "latitude": 45.409414,
      |    "longitude": -50.022516,
      |    "tags": [
      |      "ex",
      |      "labore",
      |      "nisi",
      |      "incididunt",
      |      "cillum",
      |      "proident",
      |      "duis"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Hicks Myers"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Casey Brock"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Manning Clark"
      |      }
      |    ],
      |    "greeting": "Hello, Petty Black! You have 5 unread messages.",
      |    "favoriteFruit": "banana"
      |  },
      |  {
      |    "_id": "576278dffb97dcb654eb1918",
      |    "index": 5,
      |    "guid": "d060260c-ea72-4844-9055-a022069a59e3",
      |    "isActive": false,
      |    "balance": "$2,261.26",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 36,
      |    "eyeColor": "blue",
      |    "name": "Stephenson Klein",
      |    "gender": "male",
      |    "company": "COSMETEX",
      |    "email": "stephensonklein@cosmetex.com",
      |    "phone": "+1 (964) 494-2180",
      |    "address": "753 Tapscott Street, Homestead, Hawaii, 9007",
      |    "about": "Eu culpa ut velit eu commodo tempor sunt laborum sunt proident duis dolor. Fugiat in et eiusmod non consequat. Proident mollit qui aute anim dolore velit nisi amet laborum Lorem sint adipisicing. Ipsum dolore consectetur Lorem est officia mollit mollit ad eiusmod. Amet esse consectetur Lorem aliquip in.\r\n",
      |    "registered": "2014-09-04T06:37:39 -10:00",
      |    "latitude": -18.768686,
      |    "longitude": -44.638235,
      |    "tags": [
      |      "pariatur",
      |      "eiusmod",
      |      "duis",
      |      "irure",
      |      "esse",
      |      "velit",
      |      "laboris"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Rose Cervantes"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Herman Blake"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Shawna Kirkland"
      |      }
      |    ],
      |    "greeting": "Hello, Stephenson Klein! You have 4 unread messages.",
      |    "favoriteFruit": "strawberry"
      |  },
      |  {
      |    "_id": "576278dfaa683de3dbf6dcc0",
      |    "index": 6,
      |    "guid": "30652501-b255-4b9a-a4f8-7171381c026c",
      |    "isActive": false,
      |    "balance": "$1,860.90",
      |    "picture": "http://placehold.it/32x32",
      |    "age": 24,
      |    "eyeColor": "green",
      |    "name": "Maribel Dixon",
      |    "gender": "female",
      |    "company": "ENERFORCE",
      |    "email": "maribeldixon@enerforce.com",
      |    "phone": "+1 (917) 412-2152",
      |    "address": "842 Lawrence Street, Hendersonville, Nebraska, 7598",
      |    "about": "Lorem elit et consectetur duis esse exercitation veniam qui sunt et consequat. Ullamco velit do in adipisicing duis fugiat nostrud ipsum veniam non ipsum commodo quis quis. Quis esse commodo in pariatur ullamco cillum proident nisi. Nostrud amet exercitation amet quis.\r\n",
      |    "registered": "2015-08-17T07:24:03 -10:00",
      |    "latitude": 85.39362,
      |    "longitude": 159.075878,
      |    "tags": [
      |      "anim",
      |      "consequat",
      |      "excepteur",
      |      "officia",
      |      "esse",
      |      "quis",
      |      "consectetur"
      |    ],
      |    "friends": [
      |      {
      |        "id": 0,
      |        "name": "Cochran Rojas"
      |      },
      |      {
      |        "id": 1,
      |        "name": "Sherri Norton"
      |      },
      |      {
      |        "id": 2,
      |        "name": "Angie Little"
      |      }
      |    ],
      |    "greeting": "Hello, Maribel Dixon! You have 4 unread messages.",
      |    "favoriteFruit": "banana"
      |  }
      |]
    """.stripMargin
}