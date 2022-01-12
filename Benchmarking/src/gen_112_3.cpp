  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    s1 p1;
    s5(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s5 f52(const s5 &v0) {
    const s1 v7 = v0.p1;
    s1 v9 = v7;
    s1 v14 = v9;
    const s1 v47 = v0.p1;
    const s5 v159(v14, v47);
    return v159;
  }
  s2 f49(const s2 &v0) {
    s2 v6 = v0;
    const std::vector<s0> v3 = v0.p0;
    const std::vector<s1> v27 = v6.p1;
    v6.p1 = v27;
    v6.p0 = v3;
    return v6;
  }
  std::vector<s1> f46(const std::vector<s1> &v0) {
    return v0;
  }
  s3 f43(const s3 &v0) {
    const s2 v5 = v0.p1;
    s2 v4 = v5;
    const s3 v3(v4, v5);
    s3 v68 = v3;
    return v68;
  }
  s3 f35(const s3 &v0) {
    const s3 v1 = f43(v0);
    s3 v35 = v1;
    return v35;
  }
  s3 f29(const s3 &v0) {
    s3 v6 = v0;
    s3 v5 = v0;
    const s3 v7 = f35(v6);
    s3 v1 = v7;
    const s3 v4 = f43(v1);
    const s2 v2 = v0.p1;
    v1.p1 = v2;
    const s3 v8 = f43(v7);
    const s2 v10 = f49(v2);
    v6.p0 = v2;
    const std::vector<s0> v11 = v2.p0;
    const s3 v12 = f43(v5);
    s2 v9 = v10;
    s2 v14 = v9;
    const s2 v25 = v1.p0;
    const s2 v16 = f49(v10);
    const std::vector<s2> v21 { v14, v16, v9, v25, v2 };
    const s2 v30 = v4.p1;
    const s2 v36 = f49(v9);
    v5 = v8;
    const s3 v31 = f43(v12);
    v6.p0 = v36;
    const std::vector<s1> v33 = v14.p1;
    const s2 v19 = v21[0];
    const s2 v26 = v21[3];
    const s2 v43 = v7.p1;
    v14.p1 = v33;
    const std::vector<s1> v27 = f46(v33);
    const std::vector<s1> v35 = f46(v27);
    v9.p0 = v11;
    const s2 v39 = v31.p0;
    v6.p1 = v39;
    const s2 v54 = v21[3];
    const std::vector<s0> v40 = v30.p0;
    v6.p1 = v26;
    const s2 v87 = v31.p1;
    const std::vector<s0> v47 = v87.p0;
    const s2 v58 = v31.p0;
    v14.p0 = v47;
    const s2 v62 = f49(v2);
    v1.p0 = v62;
    v5.p1 = v30;
    v9.p1 = v35;
    v5.p1 = v54;
    const s2 v98 = f49(v87);
    v1.p0 = v58;
    v1.p1 = v62;
    v5.p0 = v98;
    const s3 v66(v43, v19);
    v9.p0 = v40;
    const s3 v182 = f43(v66);
    v1.p0 = v2;
    return v182;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    double v3 = v1;
    const s3 v5 = f29(v0);
    s3 v9 = v5;
    const s2 v2 = v9.p1;
    const std::vector<s1> v13 = v2.p1;
    v9.p0 = v2;
    std::vector<s1> v28 = v13;
    const s1 v20 = v28[2];
    const s1 v34 = v28[0];
    s1 v26 = v34;
    const s0 v33 = v20.p0;
    s1 v23 = v34;
    const std::vector<double> v47 = v33.p1;
    const double v60 = v47[1];
    v28[0] = v34;
    v23 = v20;
    const s5 v44(v26, v20);
    const double v30 = v60 + v3;
    const s5 v86 = f52(v44);
    const double v70 = v30 - v60;
    const s1 v61 = v86.p0;
    v28[1] = v23;
    v28[0] = v61;
    return v70;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 } }, { 2.0, 3.0, 4.0 }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { 10.0, 11.0, 12.0 }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { { 16.0 }, { 17.0 } }, { 18.0, 19.0, 20.0 }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { 26.0, 27.0, 28.0 }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { 32.0 }, { 33.0 } }, { 34.0, 35.0, 36.0 }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { 42.0, 43.0, 44.0 }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 } }, { 50.0, 51.0, 52.0 }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { 58.0, 59.0, 60.0 }, { { 61.0 }, { 62.0 }, { 63.0 } } } } } }, { { { { { 64.0 }, { 65.0 } }, { 66.0, 67.0, 68.0 }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { 74.0, 75.0, 76.0 }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { { 80.0 }, { 81.0 } }, { 82.0, 83.0, 84.0 }, { { 85.0 }, { 86.0 }, { 87.0 } } }, { { { 88.0 }, { 89.0 } }, { 90.0, 91.0, 92.0 }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { { 96.0 }, { 97.0 } }, { 98.0, 99.0, 100.0 }, { { 101.0 }, { 102.0 }, { 103.0 } } }, { { { 104.0 }, { 105.0 } }, { 106.0, 107.0, 108.0 }, { { 109.0 }, { 110.0 }, { 111.0 } } } }, { { { { 112.0 }, { 113.0 } }, { 114.0, 115.0, 116.0 }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 } }, { 122.0, 123.0, 124.0 }, { { 125.0 }, { 126.0 }, { 127.0 } } } } } } });
    double v1(128.0);
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
