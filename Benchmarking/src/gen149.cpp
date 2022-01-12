  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s2 p1;
    s3(std::vector<s1> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s1 p1;
    s4(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s4> p0;
    std::vector<std::vector<s3>> p1;
    s5(std::vector<s4> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  s5 f17(const s5 &v0) {
    s5 v4 = v0;
    const std::vector<s4> v6 = v4.p0;
    const std::vector<std::vector<s3>> v27 = v0.p1;
    v4.p1 = v27;
    v4.p0 = v6;
    return v4;
  }
  s5 f16(const s5 &v0) {
    s5 v2 = v0;
    const std::vector<s4> v14 = v0.p0;
    const s5 v26 = f17(v2);
    v2 = v0;
    v2.p0 = v14;
    return v26;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const s5 v6 = v0[0];
    const s5 v2 = f16(v6);
    s5 v7 = v2;
    s5 v4 = v7;
    s5 v3 = v4;
    const std::vector<s4> v9 = v3.p0;
    const s4 v13 = v9[1];
    const std::vector<s4> v17 = v3.p0;
    v4.p0 = v17;
    v3.p0 = v17;
    v3.p0 = v9;
    const s0 v21 = v13.p0;
    v3.p0 = v17;
    v3.p0 = v17;
    v3.p0 = v9;
    v7.p0 = v9;
    s0 v25 = v21;
    s0 v20 = v25;
    const std::vector<std::vector<double>> v37 = v20.p1;
    v3.p0 = v9;
    const std::vector<double> v51 = v37[1];
    std::vector<s4> v28 = v9;
    std::vector<s4> v125 = v17;
    const double v85 = v51[0];
    v3.p0 = v28;
    v4.p0 = v125;
    return v85;
  }
  int main() {
    std::vector<s5> v0({ { { { { 0.0, { { 1.0 }, { 2.0 } } }, { { 3.0, { { 4.0 }, { 5.0 } } }, { 6.0, { { 7.0 }, { 8.0 } } } } }, { { 9.0, { { 10.0 }, { 11.0 } } }, { { 12.0, { { 13.0 }, { 14.0 } } }, { 15.0, { { 16.0 }, { 17.0 } } } } }, { { 18.0, { { 19.0 }, { 20.0 } } }, { { 21.0, { { 22.0 }, { 23.0 } } }, { 24.0, { { 25.0 }, { 26.0 } } } } } }, { { { { { { 27.0, { { 28.0 }, { 29.0 } } }, { 30.0, { { 31.0 }, { 32.0 } } } }, { { 33.0, { { 34.0 }, { 35.0 } } }, { 36.0, { { 37.0 }, { 38.0 } } } } }, { { { 39.0, { { 40.0 }, { 41.0 } } } }, { { 42.0, { { 43.0 }, { 44.0 } } }, { 45.0, { { 46.0 }, { 47.0 } } } } } } } } }, { { { { 48.0, { { 49.0 }, { 50.0 } } }, { { 51.0, { { 52.0 }, { 53.0 } } }, { 54.0, { { 55.0 }, { 56.0 } } } } }, { { 57.0, { { 58.0 }, { 59.0 } } }, { { 60.0, { { 61.0 }, { 62.0 } } }, { 63.0, { { 64.0 }, { 65.0 } } } } }, { { 66.0, { { 67.0 }, { 68.0 } } }, { { 69.0, { { 70.0 }, { 71.0 } } }, { 72.0, { { 73.0 }, { 74.0 } } } } } }, { { { { { { 75.0, { { 76.0 }, { 77.0 } } }, { 78.0, { { 79.0 }, { 80.0 } } } }, { { 81.0, { { 82.0 }, { 83.0 } } }, { 84.0, { { 85.0 }, { 86.0 } } } } }, { { { 87.0, { { 88.0 }, { 89.0 } } } }, { { 90.0, { { 91.0 }, { 92.0 } } }, { 93.0, { { 94.0 }, { 95.0 } } } } } } } } } });
    double v1(96.0);
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
