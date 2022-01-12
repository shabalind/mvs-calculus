  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    std::vector<double> p3;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1, s0 v2, std::vector<double> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  double f5(const double &v0) {
    const double v1 = v0 + v0;
    double v7 = v1;
    double v2 = v1;
    double v10 = v0;
    double v15 = v7;
    double v4 = v15;
    double v24 = v1;
    const std::vector<double> v6 { v1, v24, v0, v10, v1, v0, v4 };
    const double v16 = v6[3];
    const double v21 = v6[4];
    std::vector<double> v13 = v6;
    v13[5] = v21;
    const std::vector<double> v28 { v2 };
    const std::vector<std::vector<double>> v42 { v28 };
    const double v14 = v13[0];
    const std::vector<double> v30 = v42[0];
    v13[4] = v14;
    v13[5] = v4;
    std::vector<double> v66 = v13;
    double v44 = v16;
    v66[5] = v14;
    const double v46 = v66[6];
    const double v95 = v66[6];
    v13[4] = v24;
    v13[0] = v44;
    v13[4] = v21;
    const std::vector<double> v98 = v42[0];
    std::vector<double> v55 = v98;
    v55[0] = v95;
    const double v191 = v30[0];
    v55 = v28;
    const double v78 = v55[0];
    v13[3] = v95;
    v55[0] = v46;
    v66[1] = v10;
    v66[4] = v191;
    return v78;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const double v4 = f5(v1);
    const double v21 = f5(v1);
    const double v49 = v21 - v4;
    const double v54 = f5(v49);
    return v54;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { 20.0, 21.0, 22.0 } });
    double v1(23.0);
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
