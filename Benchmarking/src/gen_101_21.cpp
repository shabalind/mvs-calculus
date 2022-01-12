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
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s1(s0 v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  std::vector<double> f2(const std::vector<double> &v0) {
    std::vector<double> v2 = v0;
    const double v5 = v2[0];
    double v1 = v5;
    const std::vector<std::vector<double>> v3 { v0, v0 };
    v2[0] = v1;
    v2[0] = v5;
    double v9 = v1;
    std::vector<double> v6 = v0;
    v6[0] = v9;
    v6[0] = v1;
    std::vector<std::vector<double>> v8 = v3;
    const double v11 = v2[0];
    const std::vector<std::vector<double>> v22 { v0, v6 };
    std::vector<std::vector<double>> v21 = v3;
    v2[0] = v1;
    v21[0] = v6;
    v8[1] = v0;
    v8[1] = v2;
    const std::vector<double> v28 = v22[1];
    std::vector<std::vector<double>> v48 = v8;
    const std::vector<double> v45 = v48[0];
    v48[0] = v28;
    v2[0] = v11;
    v48 = v21;
    return v45;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    const s1 v5 = v0[0];
    const s0 v3 = v5.p0;
    const std::vector<std::vector<double>> v14 = v3.p0;
    const std::vector<double> v49 = v14[0];
    const std::vector<double> v41 = f2(v49);
    const std::vector<double> v21 = f2(v41);
    const double v30 = v21[0];
    return v30;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } });
    double v2(28.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
