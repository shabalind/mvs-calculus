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
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    s8(s0 v0): p0(v0) { }
  };
  struct s9 {
    std::vector<s1> p0;
    s2 p1;
    s9(std::vector<s1> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s1 f56(const s1 &v0) {
    const std::vector<s1> v5 { v0 };
    const s1 v6 = v5[0];
    const s1 v7 = v5[0];
    std::vector<s1> v8 = v5;
    s1 v4 = v7;
    v8 = v5;
    const s1 v3 = v5[0];
    v8[0] = v7;
    s1 v12 = v7;
    const s0 v11 = v3.p0;
    const std::vector<std::vector<double>> v15 = v11.p1;
    v12 = v6;
    std::vector<std::vector<double>> v18 = v15;
    std::vector<s1> v33 = v8;
    std::vector<s1> v51 = v33;
    const s1 v27 = v51[0];
    v51[0] = v4;
    std::vector<std::vector<double>> v22 = v18;
    const s0 v26 = v6.p0;
    v12.p0 = v11;
    s0 v28 = v11;
    const std::vector<std::vector<double>> v43 = v28.p0;
    const s0 v39 = v12.p0;
    const s8 v57(v11);
    v4.p0 = v39;
    v12.p0 = v28;
    v28.p1 = v22;
    v51[0] = v3;
    v12.p0 = v39;
    const s0 v52 = v57.p0;
    v12.p0 = v11;
    v28.p0 = v43;
    v12.p0 = v52;
    v12.p0 = v26;
    return v27;
  }
  s9 f41(const s9 &v0) {
    const std::vector<s1> v1 = v0.p0;
    const std::vector<s1> v7 = v0.p0;
    s9 v6 = v0;
    const s1 v2 = v1[1];
    s1 v4 = v2;
    s1 v5 = v4;
    s9 v9 = v0;
    const s1 v11 = f56(v5);
    const std::vector<s0> v8 = v2.p1;
    v9.p0 = v7;
    v6.p0 = v7;
    std::vector<s1> v23 = v7;
    std::vector<s0> v10 = v8;
    v23 = v7;
    const s1 v20 = f56(v4);
    const s2 v21(v20, v5);
    s2 v17 = v21;
    const s2 v16 = v6.p1;
    v9.p0 = v1;
    const s1 v19 = v23[1];
    v17.p1 = v2;
    v23[2] = v11;
    const s2 v22 = v9.p1;
    const s0 v18 = v19.p0;
    s0 v36 = v18;
    v10[1] = v36;
    v9.p1 = v16;
    const std::vector<s1> v13 = v6.p0;
    const s0 v28 = v8[1];
    v6.p1 = v16;
    std::vector<s0> v24 = v10;
    s0 v31 = v28;
    v9.p1 = v17;
    s0 v33 = v31;
    const s8 v37(v36);
    const std::vector<std::vector<double>> v84 = v33.p1;
    const s0 v64 = v37.p0;
    v33.p1 = v84;
    v10[0] = v36;
    v10[1] = v64;
    v36.p1 = v84;
    v10[1] = v31;
    const s1 v41(v64, v10);
    v23[1] = v19;
    const s0 v88 = v8[0];
    const s9 v54(v13, v21);
    v23[0] = v41;
    v10[1] = v33;
    const s0 v59 = v37.p0;
    const s0 v48 = v37.p0;
    v10[1] = v48;
    const std::vector<std::vector<double>> v47 = v59.p0;
    v36.p0 = v47;
    const std::vector<s1> v71 = v54.p0;
    v23[0] = v20;
    const s9 v45(v71, v22);
    v23 = v71;
    v4.p0 = v88;
    v24[2] = v48;
    v9.p0 = v7;
    v31.p1 = v84;
    v4.p1 = v24;
    v10[1] = v59;
    v9.p0 = v1;
    return v45;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const s9 v5 = f41(v0);
    const s2 v6 = v5.p1;
    const s1 v11 = v6.p1;
    const s1 v4 = f56(v11);
    const s0 v28 = v4.p0;
    s0 v73 = v28;
    s0 v30 = v73;
    const std::vector<std::vector<double>> v23 = v30.p1;
    const std::vector<double> v39 = v23[0];
    const double v51 = v39[0];
    return v51;
  }
  int main() {
    s9 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } }, { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } }, { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } }, { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } }, { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } }, { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } } } } });
    double v1(100.0);
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
