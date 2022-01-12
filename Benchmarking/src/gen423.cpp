  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s2(s0 v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s2> p0;
    s3 p1;
    s0 p2;
    s7(std::vector<s2> v0, s3 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  std::vector<s1> f109(const std::vector<s1> &v0) {
    std::vector<s1> v7 = v0;
    std::vector<s1> v3 = v7;
    const s1 v2 = v0[0];
    v3[0] = v2;
    std::vector<s1> v1 = v3;
    return v1;
  }
  double f77(const std::vector<s1> &v0, const double &v1) {
    const s1 v7 = v0[1];
    const s0 v6 = v7.p1;
    s1 v18 = v7;
    v18.p1 = v6;
    const s0 v31 = v18.p1;
    v18.p1 = v6;
    v18.p1 = v6;
    v18.p1 = v6;
    const std::vector<s0> v17 { v6, v31, v31, v31, v31 };
    const s0 v47 = v17[4];
    const s0 v34 = v17[4];
    const std::vector<std::vector<s0>> v41 = v18.p0;
    std::vector<s0> v72 = v17;
    v18.p1 = v34;
    const std::vector<s0> v59 = v41[1];
    v18.p1 = v34;
    v18.p1 = v47;
    const s0 v93 = v72[0];
    v72[3] = v47;
    v18.p1 = v31;
    v18.p0 = v41;
    const std::vector<std::vector<s0>> v159 = v18.p0;
    v18.p0 = v159;
    const s0 v163 = v59[0];
    v18.p0 = v41;
    const std::vector<double> v126 = v93.p1;
    v18.p1 = v163;
    const double v195 = v126[1];
    v18.p1 = v34;
    return v195;
  }
  std::vector<std::vector<s0>> f53(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v3 = v0;
    const std::vector<s0> v5 = v3[1];
    const std::vector<s0> v4 = v3[1];
    std::vector<s0> v12 = v4;
    v3[0] = v12;
    std::vector<std::vector<s0>> v6 = v3;
    v3[0] = v4;
    const s0 v10 = v4[0];
    v3[0] = v5;
    const std::vector<s0> v18 = v6[1];
    v3[0] = v12;
    v12[0] = v10;
    std::vector<std::vector<s0>> v29 = v0;
    v29[1] = v18;
    v12 = v5;
    return v29;
  }
  s1 f52(const s0 &v0, const s1 &v1) {
    const std::vector<s1> v4 { v1, v1, v1, v1, v1, v1, v1 };
    const s1 v5 = v4[3];
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p0;
    s1 v14 = v5;
    v14.p1 = v0;
    const std::vector<double> v12 = v0.p1;
    const std::vector<double> v15 = v0.p1;
    const double v18 = v15[0];
    s0 v17 = v0;
    const std::vector<std::vector<s0>> v10 = v5.p0;
    const std::vector<std::vector<s0>> v31 = f53(v10);
    std::vector<double> v30 = v12;
    const std::vector<std::vector<s0>> v20 = f53(v31);
    v14.p1 = v17;
    const std::vector<double> v23 = v2[1];
    v30[1] = v18;
    std::vector<std::vector<s0>> v27 = v20;
    const double v33 = v23[0];
    const std::vector<std::vector<s0>> v36 = f53(v27);
    const double v54 = v33 / v18;
    s0 v48 = v17;
    std::vector<double> v47 = v15;
    const std::vector<std::vector<double>> v91 = v48.p0;
    v30[1] = v18;
    v30[0] = v54;
    const std::vector<s0> v49 = v10[0];
    const s0 v129 = v49[0];
    s0 v51 = v17;
    v17 = v51;
    const std::vector<std::vector<s0>> v73 = f53(v10);
    const std::vector<std::vector<s0>> v41 = f53(v36);
    v47[1] = v54;
    std::vector<std::vector<double>> v110 = v91;
    const std::vector<double> v106 = v48.p1;
    std::vector<double> v140 = v30;
    const s0 v125 = v14.p1;
    v14.p1 = v129;
    v17.p1 = v140;
    v14.p1 = v51;
    const std::vector<std::vector<double>> v112 = v125.p0;
    v17.p0 = v110;
    v48.p0 = v112;
    const std::vector<std::vector<s0>> v234 = f53(v73);
    v48.p1 = v106;
    v14.p0 = v41;
    v17.p1 = v47;
    v51.p0 = v7;
    v14.p0 = v234;
    return v14;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s3 &v1, const std::vector<s7> &v2, const double &v3) {
    const std::vector<s0> v5 = v1.p1;
    const s0 v6 = v5[2];
    const std::vector<s0> v8 = v1.p1;
    const s0 v15 = v8[2];
    const s1 v16 = f52(v15, v0);
    const std::vector<double> v19 = v6.p1;
    const s0 v32 = v8[2];
    const double v18 = v19[1];
    const double v33 = v18 / v3;
    std::vector<double> v22 = v19;
    const std::vector<std::vector<s0>> v17 = v0.p0;
    const double v56 = v19[1];
    s1 v24 = v0;
    const std::vector<std::vector<s0>> v35 = f53(v17);
    const std::vector<s1> v64 { v0, v16, v24 };
    const s0 v59 = v5[1];
    v22[1] = v56;
    const s1 v50 = v64[0];
    const std::vector<s1> v37 = f109(v64);
    const s1 v58(v17, v59);
    const std::vector<std::vector<s0>> v63 = v58.p0;
    std::vector<std::vector<s0>> v85 = v63;
    v24.p0 = v35;
    v24 = v50;
    const double v91 = f77(v37, v33);
    v24.p0 = v85;
    v24.p1 = v32;
    std::vector<double> v77 = v22;
    v77[1] = v91;
    const double v163 = v77[0];
    v77[0] = v56;
    return v163;
  }
  int main() {
    s1 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { 8.0, 9.0 } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { 13.0, 14.0 } } });
    s3 v1({ { { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { 18.0, 19.0 } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { 23.0, 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { 28.0, 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { 33.0, 34.0 } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { 38.0, 39.0 } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { 43.0, 44.0 } } } });
    std::vector<s7> v2({ { { { { { { 45.0 }, { 46.0 }, { 47.0 } }, { 48.0, 49.0 } }, { { { { { 50.0 }, { 51.0 }, { 52.0 } }, { 53.0, 54.0 } } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { 58.0, 59.0 } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { 63.0, 64.0 } }, { { { { { 65.0 }, { 66.0 }, { 67.0 } }, { 68.0, 69.0 } } } }, { { { 70.0 }, { 71.0 }, { 72.0 } }, { 73.0, 74.0 } } }, { { { { 75.0 }, { 76.0 }, { 77.0 } }, { 78.0, 79.0 } }, { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { 83.0, 84.0 } } } }, { { { 85.0 }, { 86.0 }, { 87.0 } }, { 88.0, 89.0 } } } }, { { { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { 93.0, 94.0 } } }, { { { { 95.0 }, { 96.0 }, { 97.0 } }, { 98.0, 99.0 } } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { 103.0, 104.0 } } }, { { { { 105.0 }, { 106.0 }, { 107.0 } }, { 108.0, 109.0 } }, { { { 110.0 }, { 111.0 }, { 112.0 } }, { 113.0, 114.0 } }, { { { 115.0 }, { 116.0 }, { 117.0 } }, { 118.0, 119.0 } } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { 123.0, 124.0 } } } });
    double v3(125.0);
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
