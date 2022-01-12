  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<double>> p0;
    s0 p1;
    s1(std::vector<std::vector<double>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s2 p1;
    s3(std::vector<s1> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s2 f88(const s2 &v0) {
    const std::vector<std::vector<s0>> v2 = v0.p0;
    s2 v12 = v0;
    v12.p0 = v2;
    s2 v72 = v12;
    return v72;
  }
  std::vector<std::vector<s0>> f86(const std::vector<std::vector<s0>> &v0) {
    const std::vector<s0> v5 = v0[1];
    std::vector<std::vector<s0>> v7 = v0;
    v7 = v0;
    v7[2] = v5;
    std::vector<s0> v3 = v5;
    v7[1] = v5;
    v7[1] = v5;
    v7[0] = v5;
    v7[0] = v3;
    v7[1] = v3;
    std::vector<std::vector<s0>> v109 = v7;
    std::vector<std::vector<s0>> v116 = v109;
    return v116;
  }
  s2 f77(const s2 &v0) {
    s2 v7 = v0;
    s2 v6 = v0;
    const std::vector<std::vector<s0>> v4 = v6.p0;
    const std::vector<std::vector<s0>> v8 = v7.p0;
    const std::vector<s0> v3 = v4[0];
    v6.p0 = v8;
    v7.p0 = v8;
    v7.p0 = v8;
    const std::vector<std::vector<s0>> v1 = v6.p0;
    const s2 v10 = f88(v6);
    std::vector<s0> v9 = v3;
    s2 v18 = v6;
    const std::vector<s0> v16 = v18.p1;
    v6.p0 = v1;
    s2 v22 = v6;
    v6 = v10;
    std::vector<s0> v25 = v16;
    v6.p1 = v25;
    const s0 v21 = v9[0];
    const std::vector<s0> v23 = v18.p1;
    v25[0] = v21;
    std::vector<s0> v17 = v16;
    v22.p1 = v23;
    v22.p1 = v17;
    v22.p1 = v17;
    return v22;
  }
  std::vector<std::vector<s0>> f63(const std::vector<std::vector<s0>> &v0) {
    const std::vector<std::vector<s0>> v6 = f86(v0);
    const std::vector<std::vector<s0>> v1 = f86(v0);
    const std::vector<s0> v3 = v0[2];
    std::vector<std::vector<s0>> v11 = v1;
    std::vector<s0> v12 = v3;
    v11[2] = v12;
    const std::vector<std::vector<s0>> v17 = f86(v11);
    const std::vector<s0> v15 = v6[2];
    v11[2] = v12;
    const std::vector<std::vector<s0>> v48 = f86(v17);
    const std::vector<std::vector<s0>> v155 = f86(v48);
    v11[2] = v15;
    return v155;
  }
  s2 f52(const s2 &v0) {
    s2 v5 = v0;
    const std::vector<std::vector<s0>> v1 = v0.p0;
    std::vector<std::vector<s0>> v3 = v1;
    const s2 v9 = f77(v5);
    const std::vector<s0> v6 = v9.p1;
    const s2 v7(v3, v6);
    std::vector<std::vector<s0>> v14 = v1;
    const s2 v11 = f77(v7);
    const std::vector<std::vector<s0>> v16 = f63(v14);
    v5.p0 = v14;
    v5.p0 = v16;
    return v11;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s3> &v1, const s3 &v2, const double &v3) {
    const s2 v5 = v0.p1;
    const s2 v4 = f88(v5);
    const s2 v16 = f52(v4);
    const std::vector<s0> v58 = v16.p1;
    const s0 v46 = v58[1];
    s0 v40 = v46;
    const std::vector<std::vector<double>> v18 = v40.p1;
    const std::vector<double> v31 = v18[0];
    const double v50 = v31[0];
    v40 = v46;
    return v50;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 } }, { { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } } });
    std::vector<s3> v1({ { { { { { 32.0 }, { 33.0 } }, { { { 34.0 }, { 35.0 }, { 36.0 } }, { { 37.0 } } } }, { { { 38.0 }, { 39.0 } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } }, { { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } } } });
    s3 v2({ { { { { 64.0 }, { 65.0 } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 } } } }, { { { 70.0 }, { 71.0 } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } } } }, { { { { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } } }, { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } } }, { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } } } });
    double v3(96.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
