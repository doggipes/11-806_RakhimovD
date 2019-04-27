var express = require('express');
var router = express.Router();

var posts = [
    { name: 'Parovarka', price: '1488'},
    { name: 'Parovarka', price: '1488'},
    { name: 'Parovarka', price: '1488'}
];

/* GET home page. */
router.post('/', function(req, res) {
    res.redirect('index.html');
});

router.get('/', function (req, res) {
    //var name = req.body.name_of_product;
    var price = req.body.price_of_product;

    console.log('normama');
    posts.push( {'name': name, 'price': price});
    res.render('index.html', {posts: posts});
});

module.exports = router;