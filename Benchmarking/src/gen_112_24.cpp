  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v4 = v0[0];
    const s1 v3 = v4[0];
    const std::vector<s0> v6 = v3.p0;
    const s0 v28 = v6[0];
    const std::vector<std::vector<double>> v19 = v28.p0;
    const std::vector<double> v29 = v19[1];
    std::vector<double> v40 = v29;
    const double v45 = v29[0];
    v40[0] = v45;
    const double v36 = v40[0];
    v40[0] = v36;
    v40[0] = v36;
    const double v208 = v1 + v36;
    return v208;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } });
    double v1(18.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
