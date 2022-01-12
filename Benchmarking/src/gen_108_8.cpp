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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s2 p1;
    s2 p2;
    s3(std::vector<s1> v0, s2 v1, s2 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s5 {
    double p0;
    s3 p1;
    s5(double v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s3 p0;
    s0 p1;
    std::vector<s3> p2;
    std::vector<s0> p3;
    std::vector<s3> p4;
    s6(s3 v0, s0 v1, std::vector<s3> v2, std::vector<s0> v3, std::vector<s3> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s8 {
    std::vector<s0> p0;
    double p1;
    s8(std::vector<s0> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s1 p0;
    s3 p1;
    s10(s1 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s12 {
    std::vector<s8> p0;
    std::vector<s6> p1;
    s12(std::vector<s8> v0, std::vector<s6> v1): p0(v0), p1(v1) { }
  };
  s1 f25(const s1 &v0) {
    s1 v7 = v0;
    const s0 v5 = v0.p1;
    v7.p1 = v5;
    const s0 v40 = v0.p1;
    const s0 v17 = v7.p0;
    s1 v21 = v7;
    const s0 v30 = v7.p1;
    v7.p0 = v5;
    v7.p1 = v17;
    const s1 v68(v17, v40);
    s1 v67 = v68;
    s1 v81 = v67;
    const s0 v119 = v0.p0;
    const s0 v64 = v67.p1;
    s1 v60 = v21;
    v67.p1 = v30;
    v67.p0 = v64;
    v81.p1 = v119;
    v60 = v81;
    return v60;
  }
  s3 f24(const s6 &v0, const s3 &v1) {
    s3 v7 = v1;
    const std::vector<s1> v2 = v7.p0;
    s3 v14 = v7;
    v7 = v14;
    v14.p0 = v2;
    v7.p0 = v2;
    v14.p0 = v2;
    const s1 v20 = v2[0];
    const s2 v24 = v14.p2;
    v7.p1 = v24;
    v7.p1 = v24;
    v7 = v1;
    const s1 v38 = f25(v20);
    std::vector<s1> v39 = v2;
    const s3 v82(v39, v24, v24);
    v39[0] = v38;
    v7.p0 = v2;
    return v82;
  }
  s6 f15(const s6 &v0) {
    return v0;
  }
  s3 f14(const s3 &v0) {
    const s2 v2 = v0.p2;
    const s0 v3 = v2.p1;
    const std::vector<s0> v5 = v2.p0;
    s3 v6 = v0;
    const std::vector<s0> v1 = v2.p0;
    const s0 v7 = v5[0];
    const s0 v8 = v1[0];
    const s0 v9 = v5[0];
    v6.p2 = v2;
    std::vector<s0> v27 = v1;
    const s0 v13 = v27[0];
    s0 v18 = v13;
    const s0 v36 = v2.p1;
    s2 v30 = v2;
    const s2 v21 = v0.p1;
    v30.p0 = v1;
    const s0 v10 = v5[0];
    v27[0] = v13;
    const s0 v41 = v1[0];
    v27[0] = v7;
    s2 v12 = v30;
    v12.p1 = v13;
    v18 = v10;
    v30.p1 = v10;
    s3 v24 = v6;
    const s0 v28 = v27[0];
    s0 v17 = v18;
    std::vector<s0> v55 = v5;
    const s0 v44 = v5[0];
    v24.p1 = v2;
    std::vector<s0> v76 = v27;
    v76[0] = v10;
    v55[0] = v28;
    std::vector<s0> v98 = v76;
    const s0 v48 = v98[0];
    v76[0] = v41;
    const std::vector<std::vector<double>> v38 = v17.p0;
    v27[0] = v44;
    const std::vector<s0> v80 { v17, v17 };
    v98[0] = v28;
    const std::vector<double> v40 = v38[0];
    const double v39 = v40[0];
    v18 = v28;
    v27[0] = v36;
    v24.p2 = v21;
    v18 = v8;
    v18.p0 = v38;
    s2 v32 = v12;
    const s0 v29 = v80[0];
    const double v51 = v48.p1;
    const double v54 = v39 / v51;
    v27 = v55;
    v6.p2 = v32;
    v98[0] = v29;
    v18.p1 = v54;
    v30.p0 = v76;
    const s2 v99 = v24.p1;
    v55[0] = v9;
    v98[0] = v3;
    v18.p0 = v38;
    const std::vector<std::vector<double>> v74 = v9.p0;
    v30.p0 = v27;
    v98[0] = v18;
    const s5 v68(v54, v24);
    s5 v71 = v68;
    const s0 v90 = v80[1];
    v17.p0 = v74;
    v55[0] = v10;
    v6.p2 = v99;
    v24.p1 = v2;
    const s3 v119 = v71.p1;
    v76[0] = v90;
    return v119;
  }
  s0 f13(const std::vector<s6> &v0, const std::vector<std::vector<s10>> &v1, const s0 &v2) {
    const std::vector<std::vector<double>> v3 = v2.p0;
    const s6 v10 = v0[0];
    const s6 v9 = f15(v10);
    const s3 v12 = v9.p0;
    s3 v13 = v12;
    const s3 v18 = f24(v10, v13);
    const std::vector<double> v19 = v3[0];
    const s2 v11 = v13.p2;
    const std::vector<s1> v16 = v12.p0;
    const s6 v21 = f15(v10);
    const s1 v32 = v16[0];
    const double v44 = v19[0];
    const std::vector<s2> v53 { v11, v11, v11, v11, v11, v11 };
    v13.p1 = v11;
    s1 v33 = v32;
    const s3 v28 = f14(v18);
    s2 v27 = v11;
    const s2 v34 = v53[1];
    const s2 v61 = v53[1];
    const s0 v56 = v33.p0;
    v27.p1 = v56;
    const std::vector<std::vector<double>> v78 = v56.p0;
    const std::vector<s0> v48 = v27.p0;
    v13.p1 = v34;
    const std::vector<s1> v96 = v28.p0;
    v13.p2 = v34;
    const s0 v91 = v21.p1;
    v33.p0 = v91;
    const s0 v86 = v48[0];
    s0 v88 = v56;
    v88.p0 = v78;
    v27.p0 = v48;
    v13.p2 = v61;
    v88.p1 = v44;
    v33.p1 = v88;
    v13.p0 = v96;
    return v86;
  }
  s0 f7(const s0 &v0) {
    const double v4 = v0.p1;
    const double v5 = v4 * v4;
    double v7 = v4;
    const s1 v6(v0, v0);
    const s1 v1 = f25(v6);
    const s0 v8 = v1.p0;
    double v13 = v5;
    const s1 v2 = f25(v6);
    const s0 v14 = v2.p1;
    const std::vector<double> v36 { v4, v13, v7, v4, v4, v7 };
    std::vector<double> v16 = v36;
    const double v21 = v16[5];
    v16[0] = v5;
    double v40 = v4;
    v16[3] = v5;
    const double v24 = v16[3];
    double v26 = v40;
    double v30 = v24;
    std::vector<double> v27 = v16;
    s0 v35 = v8;
    v27[0] = v26;
    const double v32 = v27[1];
    v16[3] = v7;
    const double v50 = v14.p1;
    v35.p1 = v30;
    v27[1] = v32;
    v35.p1 = v32;
    v35.p1 = v21;
    v35.p1 = v50;
    return v35;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s10>> &v0, const s1 &v1, const s5 &v2, const s12 &v3, const std::vector<std::vector<s1>> &v4, const double &v5) {
    const std::vector<s1> v11 = v4[0];
    const s1 v9 = f25(v1);
    const std::vector<s6> v8 = v3.p1;
    const s0 v21 = v9.p0;
    const s0 v15 = f13(v8, v0, v21);
    const s0 v29 = f7(v15);
    const s1 v20 = v11[0];
    const double v39 = v29.p1;
    const s0 v37 = v20.p0;
    const double v88 = v37.p1;
    const double v54 = v39 * v88;
    return v54;
  }
  int main() {
    std::vector<std::vector<s10>> v0({ { { { { { { 0.0 } }, 1.0 }, { { { 2.0 } }, 3.0 } }, { { { { { { 4.0 } }, 5.0 }, { { { 6.0 } }, 7.0 } } }, { { { { { 8.0 } }, 9.0 } }, { { { 10.0 } }, 11.0 } }, { { { { { 12.0 } }, 13.0 } }, { { { 14.0 } }, 15.0 } } } } } });
    s1 v1({ { { { 16.0 } }, 17.0 }, { { { 18.0 } }, 19.0 } });
    s5 v2({ 20.0, { { { { { { 21.0 } }, 22.0 }, { { { 23.0 } }, 24.0 } } }, { { { { { 25.0 } }, 26.0 } }, { { { 27.0 } }, 28.0 } }, { { { { { 29.0 } }, 30.0 } }, { { { 31.0 } }, 32.0 } } } });
    s12 v3({ { { { { { { 33.0 } }, 34.0 } }, 35.0 }, { { { { { 36.0 } }, 37.0 } }, 38.0 } }, { { { { { { { { 39.0 } }, 40.0 }, { { { 41.0 } }, 42.0 } } }, { { { { { 43.0 } }, 44.0 } }, { { { 45.0 } }, 46.0 } }, { { { { { 47.0 } }, 48.0 } }, { { { 49.0 } }, 50.0 } } }, { { { 51.0 } }, 52.0 }, { { { { { { { 53.0 } }, 54.0 }, { { { 55.0 } }, 56.0 } } }, { { { { { 57.0 } }, 58.0 } }, { { { 59.0 } }, 60.0 } }, { { { { { 61.0 } }, 62.0 } }, { { { 63.0 } }, 64.0 } } }, { { { { { { 65.0 } }, 66.0 }, { { { 67.0 } }, 68.0 } } }, { { { { { 69.0 } }, 70.0 } }, { { { 71.0 } }, 72.0 } }, { { { { { 73.0 } }, 74.0 } }, { { { 75.0 } }, 76.0 } } } }, { { { { 77.0 } }, 78.0 }, { { { 79.0 } }, 80.0 } }, { { { { { { { 81.0 } }, 82.0 }, { { { 83.0 } }, 84.0 } } }, { { { { { 85.0 } }, 86.0 } }, { { { 87.0 } }, 88.0 } }, { { { { { 89.0 } }, 90.0 } }, { { { 91.0 } }, 92.0 } } }, { { { { { { 93.0 } }, 94.0 }, { { { 95.0 } }, 96.0 } } }, { { { { { 97.0 } }, 98.0 } }, { { { 99.0 } }, 100.0 } }, { { { { { 101.0 } }, 102.0 } }, { { { 103.0 } }, 104.0 } } }, { { { { { { 105.0 } }, 106.0 }, { { { 107.0 } }, 108.0 } } }, { { { { { 109.0 } }, 110.0 } }, { { { 111.0 } }, 112.0 } }, { { { { { 113.0 } }, 114.0 } }, { { { 115.0 } }, 116.0 } } } } }, { { { { { { { 117.0 } }, 118.0 }, { { { 119.0 } }, 120.0 } } }, { { { { { 121.0 } }, 122.0 } }, { { { 123.0 } }, 124.0 } }, { { { { { 125.0 } }, 126.0 } }, { { { 127.0 } }, 128.0 } } }, { { { 129.0 } }, 130.0 }, { { { { { { { 131.0 } }, 132.0 }, { { { 133.0 } }, 134.0 } } }, { { { { { 135.0 } }, 136.0 } }, { { { 137.0 } }, 138.0 } }, { { { { { 139.0 } }, 140.0 } }, { { { 141.0 } }, 142.0 } } }, { { { { { { 143.0 } }, 144.0 }, { { { 145.0 } }, 146.0 } } }, { { { { { 147.0 } }, 148.0 } }, { { { 149.0 } }, 150.0 } }, { { { { { 151.0 } }, 152.0 } }, { { { 153.0 } }, 154.0 } } } }, { { { { 155.0 } }, 156.0 }, { { { 157.0 } }, 158.0 } }, { { { { { { { 159.0 } }, 160.0 }, { { { 161.0 } }, 162.0 } } }, { { { { { 163.0 } }, 164.0 } }, { { { 165.0 } }, 166.0 } }, { { { { { 167.0 } }, 168.0 } }, { { { 169.0 } }, 170.0 } } }, { { { { { { 171.0 } }, 172.0 }, { { { 173.0 } }, 174.0 } } }, { { { { { 175.0 } }, 176.0 } }, { { { 177.0 } }, 178.0 } }, { { { { { 179.0 } }, 180.0 } }, { { { 181.0 } }, 182.0 } } }, { { { { { { 183.0 } }, 184.0 }, { { { 185.0 } }, 186.0 } } }, { { { { { 187.0 } }, 188.0 } }, { { { 189.0 } }, 190.0 } }, { { { { { 191.0 } }, 192.0 } }, { { { 193.0 } }, 194.0 } } } } } } });
    std::vector<std::vector<s1>> v4({ { { { { { 195.0 } }, 196.0 }, { { { 197.0 } }, 198.0 } } }, { { { { { 199.0 } }, 200.0 }, { { { 201.0 } }, 202.0 } } }, { { { { { 203.0 } }, 204.0 }, { { { 205.0 } }, 206.0 } } } });
    double v5(207.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
