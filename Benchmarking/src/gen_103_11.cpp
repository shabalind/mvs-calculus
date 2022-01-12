  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s1>> p1;
    s2(s1 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    double p0;
    std::vector<std::vector<s2>> p1;
    s4(double v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  s4 f4(const s4 &v0) {
    const std::vector<s4> v1 { v0, v0, v0, v0, v0 };
    const s4 v3 = v1[0];
    s4 v2 = v3;
    const s4 v6 = v1[0];
    const std::vector<std::vector<s2>> v4 = v3.p1;
    v2.p1 = v4;
    v2.p1 = v4;
    s4 v17 = v6;
    const std::vector<std::vector<s2>> v21 = v2.p1;
    const std::vector<std::vector<s2>> v30 = v2.p1;
    v17.p1 = v30;
    v2.p1 = v21;
    return v17;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const s4 &v1, const double &v2) {
    const s4 v3 = f4(v1);
    const std::vector<s4> v7 = v0[0];
    std::vector<s4> v8 = v7;
    const std::vector<s4> v11 = v0[0];
    s4 v6 = v3;
    v8[0] = v6;
    const s4 v9 = v8[0];
    const s4 v12 = f4(v6);
    const s4 v4 = f4(v9);
    const s4 v10 = f4(v12);
    const s4 v17 = v11[0];
    const s4 v18 = f4(v10);
    const std::vector<std::vector<s2>> v5 = v4.p1;
    const s4 v21 = f4(v6);
    std::vector<std::vector<s2>> v20 = v5;
    v8[0] = v21;
    const std::vector<std::vector<s2>> v61 = v17.p1;
    v6.p1 = v61;
    v6.p1 = v61;
    v6.p1 = v20;
    v6.p1 = v61;
    const std::vector<std::vector<s2>> v40 = v4.p1;
    const std::vector<std::vector<s2>> v62 = v18.p1;
    const double v90 = v4.p0;
    v20 = v40;
    v6.p1 = v62;
    return v90;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { 0.0, { { { { { { { 1.0, { { 2.0 } } } }, { { 3.0, { { 4.0 } } } }, { { 5.0, { { 6.0 } } } } }, { 7.0, { { 8.0 } } } }, { { { { { { 9.0, { { 10.0 } } } }, { { 11.0, { { 12.0 } } } }, { { 13.0, { { 14.0 } } } } }, { 15.0, { { 16.0 } } } } } } } }, { { { { { { 17.0, { { 18.0 } } } }, { { 19.0, { { 20.0 } } } }, { { 21.0, { { 22.0 } } } } }, { 23.0, { { 24.0 } } } }, { { { { { { 25.0, { { 26.0 } } } }, { { 27.0, { { 28.0 } } } }, { { 29.0, { { 30.0 } } } } }, { 31.0, { { 32.0 } } } } } } } }, { { { { { { 33.0, { { 34.0 } } } }, { { 35.0, { { 36.0 } } } }, { { 37.0, { { 38.0 } } } } }, { 39.0, { { 40.0 } } } }, { { { { { { 41.0, { { 42.0 } } } }, { { 43.0, { { 44.0 } } } }, { { 45.0, { { 46.0 } } } } }, { 47.0, { { 48.0 } } } } } } } } } } } });
    s4 v1({ 49.0, { { { { { { { 50.0, { { 51.0 } } } }, { { 52.0, { { 53.0 } } } }, { { 54.0, { { 55.0 } } } } }, { 56.0, { { 57.0 } } } }, { { { { { { 58.0, { { 59.0 } } } }, { { 60.0, { { 61.0 } } } }, { { 62.0, { { 63.0 } } } } }, { 64.0, { { 65.0 } } } } } } } }, { { { { { { 66.0, { { 67.0 } } } }, { { 68.0, { { 69.0 } } } }, { { 70.0, { { 71.0 } } } } }, { 72.0, { { 73.0 } } } }, { { { { { { 74.0, { { 75.0 } } } }, { { 76.0, { { 77.0 } } } }, { { 78.0, { { 79.0 } } } } }, { 80.0, { { 81.0 } } } } } } } }, { { { { { { 82.0, { { 83.0 } } } }, { { 84.0, { { 85.0 } } } }, { { 86.0, { { 87.0 } } } } }, { 88.0, { { 89.0 } } } }, { { { { { { 90.0, { { 91.0 } } } }, { { 92.0, { { 93.0 } } } }, { { 94.0, { { 95.0 } } } } }, { 96.0, { { 97.0 } } } } } } } } } });
    double v2(98.0);
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
