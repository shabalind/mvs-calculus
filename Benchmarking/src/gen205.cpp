  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    std::vector<std::vector<s1>> p1;
    s3(std::vector<std::vector<s2>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s2 p1;
    s4(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    s2 p1;
    s5(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s1 f30(const s1 &v0) {
    s1 v3 = v0;
    const std::vector<s1> v4 { v0, v3, v3 };
    const s1 v6 = v4[1];
    return v6;
  }
  s2 f27(const s2 &v0) {
    const s1 v4 = v0.p0;
    s1 v5 = v4;
    const s1 v8 = v0.p0;
    const std::vector<std::vector<s0>> v2 = v4.p1;
    std::vector<std::vector<s0>> v1 = v2;
    const std::vector<std::vector<std::vector<s0>>> v6 { v2, v1, v2, v1, v2, v1 };
    const s0 v10 = v8.p0;
    const std::vector<s0> v7 = v1[1];
    s2 v17 = v0;
    std::vector<s0> v13 = v7;
    s0 v21 = v10;
    s2 v12 = v17;
    std::vector<std::vector<s0>> v18 = v2;
    v12.p0 = v5;
    const std::vector<std::vector<s0>> v15 = v6[4];
    std::vector<std::vector<s0>> v27 = v18;
    v18[0] = v13;
    const std::vector<s0> v16 = v2[0];
    const s1 v43 = v0.p0;
    v5.p1 = v27;
    const double v25 = v10.p1;
    const s1 v26 = f30(v5);
    const s1 v34 = f30(v26);
    v21.p1 = v25;
    const s1 v22 = f30(v34);
    v5 = v43;
    const s1 v38 = f30(v22);
    double v24 = v25;
    s2 v32 = v12;
    v18 = v15;
    v17.p0 = v38;
    const s1 v23 = v12.p0;
    v18[0] = v16;
    const s1 v28 = f30(v23);
    const s0 v60 = v16[0];
    v5.p1 = v2;
    const s1 v63 = f30(v8);
    v13[0] = v60;
    v21.p1 = v24;
    v32.p0 = v63;
    s2 v86 = v32;
    s2 v160 = v86;
    v5.p0 = v21;
    v17.p0 = v28;
    return v160;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const std::vector<s5> &v1, const double &v2) {
    const s5 v7 = v1[0];
    const s2 v3 = v7.p1;
    const s2 v18 = f27(v3);
    const s1 v11 = v18.p0;
    const s0 v21 = v11.p0;
    const double v38 = v21.p1;
    return v38;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { { 0.0 }, { 1.0 } }, 2.0 }, { { { { { 3.0 }, { 4.0 } }, 5.0 } }, { { { { 6.0 }, { 7.0 } }, 8.0 } } } } }, { { { { { 9.0 }, { 10.0 } }, 11.0 }, { { { { { 12.0 }, { 13.0 } }, 14.0 } }, { { { { 15.0 }, { 16.0 } }, 17.0 } } } } } } }, { { { { { { { 18.0 }, { 19.0 } }, 20.0 }, { { { { { 21.0 }, { 22.0 } }, 23.0 } }, { { { { 24.0 }, { 25.0 } }, 26.0 } } } } }, { { { { { 27.0 }, { 28.0 } }, 29.0 }, { { { { { 30.0 }, { 31.0 } }, 32.0 } }, { { { { 33.0 }, { 34.0 } }, 35.0 } } } } } } }, { { { { { { { 36.0 }, { 37.0 } }, 38.0 }, { { { { { 39.0 }, { 40.0 } }, 41.0 } }, { { { { 42.0 }, { 43.0 } }, 44.0 } } } } }, { { { { { 45.0 }, { 46.0 } }, 47.0 }, { { { { { 48.0 }, { 49.0 } }, 50.0 } }, { { { { 51.0 }, { 52.0 } }, 53.0 } } } } } } } });
    std::vector<s5> v1({ { { { { { { { { { 54.0 }, { 55.0 } }, 56.0 }, { { { { { 57.0 }, { 58.0 } }, 59.0 } }, { { { { 60.0 }, { 61.0 } }, 62.0 } } } } } } }, { { { { { { 63.0 }, { 64.0 } }, 65.0 }, { { { { { 66.0 }, { 67.0 } }, 68.0 } }, { { { { 69.0 }, { 70.0 } }, 71.0 } } } } }, { { { { { 72.0 }, { 73.0 } }, 74.0 }, { { { { { 75.0 }, { 76.0 } }, 77.0 } }, { { { { 78.0 }, { 79.0 } }, 80.0 } } } } } } }, { { { { { 81.0 }, { 82.0 } }, 83.0 }, { { { { { 84.0 }, { 85.0 } }, 86.0 } }, { { { { 87.0 }, { 88.0 } }, 89.0 } } } } } } });
    double v2(90.0);
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
