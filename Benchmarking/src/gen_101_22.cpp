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
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<s1> p1;
    s4(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s1 f94(const s1 &v0) {
    const s0 v6 = v0.p1;
    s0 v5 = v6;
    const s3 v2(v0, v5);
    const s1 v24 = v2.p0;
    return v24;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const s1 v2 = v0.p0;
    const s1 v4 = f94(v2);
    const s1 v5 = f94(v4);
    const std::vector<s0> v3 = v5.p0;
    const s0 v22 = v3[0];
    const std::vector<std::vector<double>> v42 = v22.p1;
    const std::vector<double> v122 = v42[0];
    const double v90 = v122[0];
    return v90;
  }
  int main() {
    s4 v0({ { { { 0.0, { { 1.0 } } } }, { 2.0, { { 3.0 } } } }, { { { { 4.0, { { 5.0 } } } }, { 6.0, { { 7.0 } } } } } });
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
