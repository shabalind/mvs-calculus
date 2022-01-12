  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    double p1;
    std::vector<s0> p2;
    s3(std::vector<std::vector<s2>> v0, double v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s8 {
    std::vector<s1> p0;
    std::vector<s3> p1;
    s8(std::vector<s1> v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  s3 f37(const s3 &v0) {
    const std::vector<s0> v6 = v0.p2;
    const std::vector<s0> v2 = v0.p2;
    s3 v16 = v0;
    v16.p2 = v6;
    v16.p2 = v2;
    v16.p2 = v2;
    s3 v49 = v0;
    v16 = v49;
    s3 v45 = v16;
    return v45;
  }
  s3 f36(const s3 &v0) {
    const double v3 = v0.p1;
    s3 v5 = v0;
    const s3 v2 = f37(v5);
    const std::vector<std::vector<s2>> v4 = v5.p0;
    v5 = v0;
    v5.p1 = v3;
    double v7 = v3;
    const std::vector<s2> v6 = v4[0];
    std::vector<s2> v12 = v6;
    const std::vector<std::vector<s2>> v9 = v5.p0;
    const std::vector<s2> v17 = v4[0];
    std::vector<std::vector<s2>> v13 = v9;
    v13[0] = v12;
    const std::vector<s0> v15 = v5.p2;
    v13[0] = v12;
    const std::vector<s2> v22 = v9[0];
    const double v18 = v2.p1;
    v5.p1 = v18;
    v13[0] = v22;
    const s3 v55(v4, v7, v15);
    std::vector<s2> v37 = v12;
    v13[0] = v12;
    const s3 v100 = f37(v55);
    v13[0] = v37;
    const s2 v50 = v17[0];
    v12[0] = v50;
    v5.p0 = v13;
    v13[0] = v6;
    return v100;
  }
  s3 f34(const s3 &v0) {
    const s3 v7 = f37(v0);
    s3 v1 = v7;
    const double v6 = v1.p1;
    s3 v4 = v1;
    const double v5 = v1.p1;
    double v11 = v6;
    const std::vector<s0> v15 = v0.p2;
    v4.p2 = v15;
    v1.p1 = v11;
    v1.p2 = v15;
    const s3 v13 = f37(v0);
    v4.p1 = v5;
    const double v47 = v7.p1;
    const s3 v18 = f36(v1);
    const s3 v30 = f36(v4);
    const std::vector<s0> v25 = v18.p2;
    v1 = v13;
    v4.p2 = v25;
    const std::vector<s0> v20 = v4.p2;
    v1.p1 = v47;
    const double v35 = v6 + v47;
    v1.p1 = v35;
    v1.p2 = v20;
    v1.p2 = v15;
    const s3 v163 = f37(v30);
    const s3 v170 = f37(v163);
    return v170;
  }
  s3 f25(const s3 &v0) {
    s3 v1 = v0;
    const s3 v5 = f36(v0);
    const std::vector<std::vector<s2>> v8 = v1.p0;
    const std::vector<s2> v2 = v8[0];
    const double v13 = v5.p1;
    double v6 = v13;
    double v10 = v6;
    const s3 v11 = f37(v1);
    std::vector<s2> v14 = v2;
    v1.p1 = v10;
    std::vector<std::vector<s2>> v21 = v8;
    v21[0] = v14;
    v1.p0 = v21;
    v1.p1 = v6;
    return v11;
  }
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const s1 &v1, const double &v2) {
    const s8 v3 = v0[0];
    const std::vector<s3> v39 = v3.p1;
    const s3 v50 = v39[0];
    const s3 v69 = f25(v50);
    const s3 v72 = f34(v69);
    const s3 v149 = f36(v72);
    const s3 v136 = f34(v149);
    const s3 v93 = f34(v136);
    const double v83 = v93.p1;
    return v83;
  }
  int main() {
    std::vector<s8> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } }, { { { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } }, { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 } } }, { { { 25.0 } }, { { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 } } } } }, { { { { { { { { 30.0 } }, { { 31.0 }, { 32.0 } }, { { 33.0 } }, { { 34.0 } } }, { { { { 35.0 } }, { { 36.0 }, { 37.0 } }, { { 38.0 } }, { { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 } }, { { 43.0 } }, { { 44.0 } } } } } } }, 45.0, { { { { 46.0 } }, { { 47.0 }, { 48.0 } }, { { 49.0 } }, { { 50.0 } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } }, { { 54.0 } }, { { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 } }, { { 59.0 } }, { { 60.0 } } } } } } } });
    s1 v1({ { { { 61.0 } }, { { 62.0 }, { 63.0 } }, { { 64.0 } }, { { 65.0 } } }, { { { 66.0 } }, { { 67.0 }, { 68.0 } }, { { 69.0 } }, { { 70.0 } } } });
    double v2(71.0);
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
