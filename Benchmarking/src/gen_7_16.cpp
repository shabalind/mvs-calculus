  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s0 v7 = v0.p0;
    const std::vector<s2> v6 { v0 };
    const s2 v10 = v6[0];
    const std::vector<std::vector<double>> v12 = v7.p2;
    const s0 v2 = v10.p0;
    const std::vector<double> v17 = v12[2];
    const std::vector<std::vector<double>> v13 = v2.p3;
    std::vector<std::vector<double>> v43 = v13;
    const std::vector<double> v39 = v43[0];
    v43[0] = v17;
    const double v68 = v39[0];
    const double v63 = v1 - v68;
    return v63;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } }, { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 } }, { { 17.0 } } } });
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
