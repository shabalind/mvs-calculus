  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    double v2 = v1;
    const std::vector<double> v3 { v1, v1, v1, v2 };
    const double v6 = v3[2];
    const double v7 = v3[3];
    const double v9 = v3[3];
    double v4 = v2;
    std::vector<double> v13 = v3;
    v13[2] = v9;
    double v11 = v9;
    const double v15 = v13[3];
    v2 = v15;
    const double v34 = v3[0];
    double v16 = v6;
    const double v26 = v4 + v7;
    v13[1] = v34;
    const std::vector<double> v50 { v11, v26, v16, v2, v6, v34 };
    v13[2] = v15;
    const double v57 = v50[0];
    return v57;
  }
  int main() {
    s1 v0({ { { 0.0, 1.0 }, { { 2.0 }, { 3.0 } } }, { { 4.0, 5.0 }, { { 6.0 }, { 7.0 } } } });
    double v1(8.0);
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
