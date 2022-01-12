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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    std::vector<s1> p2;
    s3(s2 v0, s1 v1, std::vector<s1> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    std::vector<std::vector<s3>> v5 = v0;
    const std::vector<s3> v3 = v5[0];
    const s3 v4 = v3[0];
    const s2 v6 = v4.p0;
    const std::vector<s0> v8 = v6.p1;
    const s0 v2 = v8[1];
    std::vector<std::vector<s3>> v12 = v0;
    v5 = v12;
    v12[0] = v3;
    s0 v19 = v2;
    v5[0] = v3;
    const s0 v29 = v8[2];
    const std::vector<std::vector<double>> v26 = v19.p0;
    const std::vector<s3> v57 = v12[0];
    v5[0] = v57;
    v19.p0 = v26;
    const std::vector<double> v74 = v26[0];
    const double v39 = v74[0];
    const std::vector<std::vector<double>> v50 = v29.p1;
    v19.p1 = v50;
    v5 = v0;
    return v39;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } } } } } } } });
    double v1(30.0);
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
