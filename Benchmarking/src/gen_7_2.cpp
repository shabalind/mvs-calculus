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
    std::vector<s0> p2;
    s0 p3;
    s1(std::vector<std::vector<s0>> v0, s0 v1, std::vector<s0> v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s2 p1;
    s3(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s1 f17(const s1 &v0) {
    s1 v3 = v0;
    const s0 v2 = v3.p1;
    const s0 v1 = v0.p1;
    s0 v12 = v2;
    s1 v5 = v3;
    v3.p1 = v1;
    s0 v9 = v2;
    v5.p3 = v1;
    v9 = v12;
    const double v7 = v2.p0;
    v12.p0 = v7;
    v3.p1 = v9;
    v5 = v0;
    return v5;
  }
  s3 f6(const s3 &v0) {
    const std::vector<s3> v2 { v0, v0, v0, v0, v0 };
    s3 v4 = v0;
    const s3 v1 = v2[2];
    const s1 v5 = v4.p0;
    const s2 v3 = v1.p1;
    const s1 v7 = f17(v5);
    v4 = v0;
    const s1 v13 = v3.p1;
    v4.p0 = v7;
    const s1 v19 = f17(v5);
    const s1 v29 = f17(v19);
    const std::vector<s1> v40 = v3.p0;
    const s2 v43(v40, v29);
    v4.p0 = v13;
    const s1 v70 = v43.p1;
    v4.p0 = v70;
    s3 v67 = v4;
    return v67;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v3 = v0;
    const s3 v2 = f6(v3);
    const s1 v7 = v2.p0;
    v3.p0 = v7;
    const s1 v4 = f17(v7);
    const s2 v8 = v0.p1;
    const s3 v6(v7, v8);
    v3.p0 = v7;
    v3.p1 = v8;
    const s2 v10 = v6.p1;
    const s1 v30 = v8.p1;
    v3.p1 = v8;
    const std::vector<s0> v25 = v4.p2;
    const s0 v46 = v25[0];
    v3.p0 = v4;
    v3.p1 = v10;
    v3.p0 = v30;
    const double v83 = v46.p0;
    return v83;
  }
  int main() {
    s3 v0({ { { { { 0.0, { { 1.0 } } } } }, { 2.0, { { 3.0 } } }, { { 4.0, { { 5.0 } } }, { 6.0, { { 7.0 } } }, { 8.0, { { 9.0 } } } }, { 10.0, { { 11.0 } } } }, { { { { { { 12.0, { { 13.0 } } } } }, { 14.0, { { 15.0 } } }, { { 16.0, { { 17.0 } } }, { 18.0, { { 19.0 } } }, { 20.0, { { 21.0 } } } }, { 22.0, { { 23.0 } } } }, { { { { 24.0, { { 25.0 } } } } }, { 26.0, { { 27.0 } } }, { { 28.0, { { 29.0 } } }, { 30.0, { { 31.0 } } }, { 32.0, { { 33.0 } } } }, { 34.0, { { 35.0 } } } }, { { { { 36.0, { { 37.0 } } } } }, { 38.0, { { 39.0 } } }, { { 40.0, { { 41.0 } } }, { 42.0, { { 43.0 } } }, { 44.0, { { 45.0 } } } }, { 46.0, { { 47.0 } } } } }, { { { { 48.0, { { 49.0 } } } } }, { 50.0, { { 51.0 } } }, { { 52.0, { { 53.0 } } }, { 54.0, { { 55.0 } } }, { 56.0, { { 57.0 } } } }, { 58.0, { { 59.0 } } } } } });
    double v1(60.0);
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
