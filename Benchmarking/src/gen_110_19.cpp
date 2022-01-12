  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s3(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<s0>> v5 = v0.p1;
    const std::vector<s0> v3 = v5[0];
    const s0 v9 = v3[0];
    const std::vector<std::vector<double>> v8 = v9.p1;
    const std::vector<double> v23 = v8[1];
    const double v20 = v23[0];
    std::vector<double> v59 = v23;
    const double v34 = v59[0];
    double v53 = v2;
    const double v54 = v20 + v34;
    double v85 = v53;
    v59[0] = v85;
    return v54;
  }
  int main() {
    s3 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } } });
    s0 v1({ { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } });
    double v2(12.0);
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
