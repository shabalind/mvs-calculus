  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f1(const s2 &v0) {
    const s0 v4 = v0.p1;
    s0 v1 = v4;
    const std::vector<std::vector<double>> v2 = v4.p1;
    std::vector<std::vector<double>> v6 = v2;
    v1.p1 = v6;
    const std::vector<double> v5 = v6[2];
    const s0 v12 = v0.p0;
    v6[0] = v5;
    const std::vector<std::vector<double>> v21 = v12.p1;
    v6[2] = v5;
    const s0 v18 = v0.p1;
    s2 v11 = v0;
    v11.p0 = v4;
    const s0 v17 = v11.p0;
    v11.p1 = v12;
    const s0 v15 = v11.p1;
    std::vector<std::vector<double>> v30 = v21;
    v11.p0 = v1;
    s0 v28 = v18;
    v11.p0 = v15;
    const std::vector<s2> v48 { v0, v11 };
    const s2 v74 = v48[0];
    v11.p1 = v28;
    v11.p1 = v17;
    v28.p1 = v30;
    return v74;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s2> &v1, const double &v2) {
    const s2 v6 = f1(v0);
    const s0 v14 = v6.p1;
    const std::vector<std::vector<double>> v24 = v14.p1;
    const std::vector<double> v26 = v24[2];
    const double v69 = v26[0];
    return v69;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    std::vector<s2> v1({ { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    double v2(24.0);
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
