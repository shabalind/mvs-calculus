  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<double> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<double> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f10(const std::vector<s0> &v0) {
    const s0 v4 = v0[1];
    std::vector<s0> v6 = v0;
    v6[2] = v4;
    return v6;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v4 = v0.p0;
    const s0 v10 = v4[1];
    const s1 v16(v4, v10);
    const std::vector<s0> v15 = v16.p0;
    const std::vector<s0> v49 = f10(v15);
    const s0 v30 = v49[1];
    const std::vector<std::vector<double>> v34 = v30.p1;
    const std::vector<double> v36 = v34[0];
    std::vector<double> v48 = v36;
    const double v59 = v48[0];
    return v59;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } }, { 7.0, 8.0, 9.0 } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } }, { 17.0, 18.0, 19.0 } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 } }, { 27.0, 28.0, 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } }, { 37.0, 38.0, 39.0 } } });
    double v1(40.0);
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
