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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<s0> p1;
    s2(std::vector<s1> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    std::vector<std::vector<s0>> p1;
    s3(std::vector<std::vector<s1>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const std::vector<s2> &v1, const double &v2) {
    const s3 v6 = v0[0];
    const std::vector<std::vector<s1>> v17 = v6.p0;
    const std::vector<s1> v8 = v17[0];
    const s3 v15 = v0[0];
    const std::vector<std::vector<s0>> v18 = v15.p1;
    const std::vector<s0> v27 = v18[0];
    const s1 v32 = v8[0];
    std::vector<s0> v43 = v27;
    const s0 v61 = v43[0];
    const std::vector<s0> v96 = v32.p1;
    v43[0] = v61;
    std::vector<s0> v98 = v96;
    const s0 v51 = v98[0];
    const std::vector<std::vector<double>> v113 = v51.p1;
    const std::vector<double> v75 = v113[1];
    v98 = v43;
    const double v165 = v75[0];
    return v165;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0, { { 1.0 }, { 2.0 } } }, { 3.0, { { 4.0 }, { 5.0 } } } }, { { 6.0, { { 7.0 }, { 8.0 } } } } } } }, { { { 9.0, { { 10.0 }, { 11.0 } } } }, { { 12.0, { { 13.0 }, { 14.0 } } } } } } });
    std::vector<s2> v1({ { { { { { 15.0, { { 16.0 }, { 17.0 } } }, { 18.0, { { 19.0 }, { 20.0 } } } }, { { 21.0, { { 22.0 }, { 23.0 } } } } } }, { { 24.0, { { 25.0 }, { 26.0 } } }, { 27.0, { { 28.0 }, { 29.0 } } } } }, { { { { { 30.0, { { 31.0 }, { 32.0 } } }, { 33.0, { { 34.0 }, { 35.0 } } } }, { { 36.0, { { 37.0 }, { 38.0 } } } } } }, { { 39.0, { { 40.0 }, { 41.0 } } }, { 42.0, { { 43.0 }, { 44.0 } } } } } });
    double v2(45.0);
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
