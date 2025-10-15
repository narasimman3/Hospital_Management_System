document.querySelectorAll('form').forEach(form => {
  form.addEventListener('submit', function(e) {
    e.preventDefault();
    alert('Form submitted! (Static demo, no backend)');
    form.reset();
  });
});
