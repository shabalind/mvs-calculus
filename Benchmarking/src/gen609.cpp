  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f17(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v10 = v0.p1;
    const std::vector<s0> v9 { v5, v0 };
    v5.p1 = v10;
    const double v8 = v5.p0;
    const s0 v13 = v9[1];
    v5 = v13;
    v5.p1 = v10;
    v5 = v13;
    v5.p0 = v8;
    v5.p1 = v2;
    return v5;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v5 = v0.p1;
    s0 v7 = v5;
    const s0 v9 = f17(v5);
    const double v12 = v9.p0;
    const std::vector<std::vector<double>> v18 = v7.p1;
    const std::vector<double> v16 = v18[0];
    const double v13 = v16[0];
    double v48 = v12;
    double v34 = v13;
    const std::vector<std::vector<double>> v84 = v9.p1;
    v7.p1 = v84;
    v7.p0 = v48;
    return v34;
  }
  int main() {
    s1 v0({ { { 0.0, { { 1.0 } } } }, { 2.0, { { 3.0 } } } });
    double v1(4.0);
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
