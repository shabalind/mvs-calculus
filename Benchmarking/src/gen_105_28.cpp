  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v2 = v0[0];
    const s2 v8 = v0[0];
    const s0 v10 = v2.p1;
    const s0 v17 = v8.p1;
    const std::vector<std::vector<double>> v24 = v17.p0;
    std::vector<std::vector<double>> v3 = v24;
    const std::vector<double> v16 = v3[0];
    const std::vector<double> v14 = v3[0];
    const std::vector<std::vector<double>> v9 = v10.p1;
    const std::vector<double> v15 = v9[1];
    const std::vector<double> v35 = v3[0];
    const std::vector<std::vector<double>> v50 { v15, v15, v35, v14, v16 };
    const std::vector<double> v49 = v50[4];
    const double v96 = v49[0];
    return v96;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } });
    double v1(20.0);
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
