  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    std::vector<std::vector<s0>> p1;
    s1(double v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s3>> p0;
    std::vector<std::vector<s0>> p1;
    s4(std::vector<std::vector<s3>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<s1> p1;
    s5(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s5 p0;
    std::vector<std::vector<s5>> p1;
    s9(s5 v0, std::vector<std::vector<s5>> v1): p0(v0), p1(v1) { }
  };
  s1 f43(const s1 &v0) {
    const double v6 = v0.p0;
    double v5 = v6;
    const std::vector<std::vector<s0>> v7 = v0.p1;
    const s1 v8(v5, v7);
    return v8;
  }
  s0 f34(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<double> v8 = v4[0];
    std::vector<std::vector<double>> v18 = v4;
    s0 v13 = v0;
    const std::vector<double> v10 = v6[0];
    std::vector<std::vector<double>> v41 = v9;
    const double v25 = v8[0];
    double v16 = v25;
    std::vector<double> v15 = v10;
    v15[0] = v16;
    std::vector<std::vector<double>> v19 = v9;
    const std::vector<std::vector<double>> v37 = v13.p1;
    v18[0] = v15;
    v13.p1 = v9;
    const std::vector<double> v23 = v5[0];
    const s0 v24(v18, v41);
    const std::vector<double> v54 = v18[0];
    v41 = v37;
    v13 = v24;
    const std::vector<std::vector<double>> v75 = v24.p1;
    v19[1] = v23;
    v13.p1 = v19;
    const std::vector<double> v77 = v75[0];
    const std::vector<double> v32 = v37[1];
    s0 v30 = v13;
    const std::vector<std::vector<double>> v67 = v30.p0;
    v30.p1 = v19;
    v18[0] = v15;
    v41[2] = v77;
    v30.p1 = v75;
    v41[0] = v32;
    const std::vector<double> v69 = v4[0];
    v18[0] = v54;
    v41[2] = v54;
    const std::vector<double> v89 = v67[0];
    v41[1] = v89;
    const std::vector<std::vector<double>> v114 = v13.p1;
    v30.p1 = v114;
    v41[1] = v69;
    v30.p1 = v9;
    v30.p1 = v41;
    v13.p1 = v75;
    return v30;
  }
  s1 f32(const s1 &v0) {
    const s1 v4 = f43(v0);
    const std::vector<std::vector<s0>> v2 = v4.p1;
    const std::vector<s0> v1 = v2[0];
    const std::vector<s0> v8 = v2[0];
    std::vector<s0> v5 = v1;
    const std::vector<s0> v29 = v2[0];
    const s1 v13 = f43(v0);
    std::vector<std::vector<s0>> v15 = v2;
    v15[0] = v5;
    const double v11 = v13.p0;
    const s1 v19(v11, v15);
    v15[0] = v29;
    const s0 v22 = v8[0];
    const std::vector<std::vector<s0>> v52 = v19.p1;
    v5[0] = v22;
    v5[0] = v22;
    v5[0] = v22;
    const double v69 = v0.p0;
    const s0 v77 = f34(v22);
    const s0 v82 = f34(v77);
    const s0 v51 = f34(v82);
    v5[0] = v51;
    const s1 v84(v69, v52);
    v5[0] = v22;
    return v84;
  }
  s1 f31(const s1 &v0) {
    const s1 v4 = f43(v0);
    const s1 v2 = f43(v4);
    const s1 v1 = f32(v2);
    s1 v3 = v1;
    const double v6 = v3.p0;
    v3.p0 = v6;
    double v7 = v6;
    v3.p0 = v6;
    const s1 v5 = f32(v0);
    const s1 v11 = f32(v5);
    const std::vector<std::vector<s0>> v8 = v11.p1;
    const std::vector<s0> v18 = v8[0];
    const double v12 = v2.p0;
    v3.p0 = v7;
    const std::vector<std::vector<s0>> v15 = v0.p1;
    const s1 v17 = f43(v4);
    const s1 v20(v12, v8);
    s1 v73 = v17;
    const s1 v30 = f32(v3);
    v73.p1 = v8;
    v73.p1 = v15;
    const s1 v38 = f43(v73);
    std::vector<std::vector<s0>> v32 = v8;
    const double v58 = v38.p0;
    v3.p1 = v15;
    v73.p1 = v15;
    const std::vector<s0> v39 = v32[0];
    v32[0] = v39;
    const std::vector<std::vector<std::vector<s0>>> v80 { v8, v8, v8, v8, v32, v8, v32 };
    const std::vector<std::vector<s0>> v182 = v3.p1;
    const s1 v46 = f32(v30);
    const std::vector<s0> v94 = v8[0];
    v3 = v46;
    const s1 v63 = f32(v20);
    const std::vector<std::vector<s0>> v162 = v63.p1;
    std::vector<std::vector<s0>> v90 = v182;
    v90[0] = v94;
    const std::vector<std::vector<s0>> v207 = v80[4];
    v73.p1 = v162;
    const s1 v131(v58, v207);
    v90[0] = v18;
    v73.p1 = v90;
    return v131;
  }
  s1 f12(const s1 &v0) {
    const s1 v6 = f43(v0);
    s1 v3 = v6;
    const s1 v4 = f43(v3);
    const s1 v7 = f31(v4);
    const s1 v8 = f32(v6);
    s1 v11 = v3;
    const s1 v2 = f31(v7);
    const double v9 = v11.p0;
    const std::vector<std::vector<s0>> v14 = v8.p1;
    const double v13 = v2.p0;
    v3 = v2;
    const std::vector<std::vector<s0>> v16 = v8.p1;
    const s1 v12 = f43(v2);
    const s1 v25(v9, v16);
    v3.p0 = v9;
    const double v18 = v3.p0;
    double v32 = v9;
    v3 = v12;
    const s1 v17 = f32(v4);
    v3.p0 = v18;
    s1 v21 = v8;
    v21.p0 = v18;
    std::vector<std::vector<s0>> v19 = v16;
    const std::vector<s0> v41 = v19[0];
    v19[0] = v41;
    s1 v49 = v17;
    v32 = v13;
    v3.p1 = v19;
    const double v27 = v25.p0;
    v11.p1 = v14;
    v11.p0 = v27;
    v49.p0 = v32;
    v11.p1 = v16;
    std::vector<std::vector<s0>> v66 = v14;
    v21.p1 = v19;
    const double v54 = v21.p0;
    s1 v209 = v49;
    v11.p1 = v66;
    v49.p0 = v54;
    return v209;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const s4 &v1, const std::vector<s9> &v2, const double &v3) {
    const std::vector<s2> v4 = v0[0];
    const s2 v9 = v4[0];
    const s1 v14 = v9.p1;
    const s1 v19 = f12(v14);
    const double v143 = v19.p0;
    const double v56 = v3 / v3;
    const double v79 = v56 - v143;
    return v79;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { 0.0, { { { { { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } } } }, { 5.0, { { { { { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } } } } }, { 10.0, { { { { { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } } } } } });
    s4 v1({ { { { { { { 15.0, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } }, { 20.0, { { { { { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } } } }, { 25.0, { { { { { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } } }, { { { 30.0, { { { { { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } } } }, { 35.0, { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } } }, { 40.0, { { { { { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } } } } }, { { { { { 45.0, { { { { { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } } } }, { 50.0, { { { { { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } } } } }, { 55.0, { { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } }, { { { 60.0, { { { { { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } } } }, { 65.0, { { { { { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } } } } }, { 70.0, { { { { { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } } } } } } }, { { { { { 75.0, { { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } } }, { 80.0, { { { { { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } } } } } }, { 85.0, { { { { { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } } }, { { { 90.0, { { { { { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } } } } }, { 95.0, { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } } } } }, { 100.0, { { { { { 101.0 } }, { { 102.0 }, { 103.0 }, { 104.0 } } } } } } } } } }, { { { { { 105.0 } }, { { 106.0 }, { 107.0 }, { 108.0 } } } } } });
    std::vector<s9> v2({ { { { { { 109.0 } }, { { 110.0 }, { 111.0 }, { 112.0 } } }, { { 113.0, { { { { { 114.0 } }, { { 115.0 }, { 116.0 }, { 117.0 } } } } } }, { 118.0, { { { { { 119.0 } }, { { 120.0 }, { 121.0 }, { 122.0 } } } } } }, { 123.0, { { { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } } } } } } }, { { { { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { 132.0, { { { { { 133.0 } }, { { 134.0 }, { 135.0 }, { 136.0 } } } } } }, { 137.0, { { { { { 138.0 } }, { { 139.0 }, { 140.0 }, { 141.0 } } } } } }, { 142.0, { { { { { 143.0 } }, { { 144.0 }, { 145.0 }, { 146.0 } } } } } } } } } } }, { { { { { 147.0 } }, { { 148.0 }, { 149.0 }, { 150.0 } } }, { { 151.0, { { { { { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } } } } }, { 156.0, { { { { { 157.0 } }, { { 158.0 }, { 159.0 }, { 160.0 } } } } } }, { 161.0, { { { { { 162.0 } }, { { 163.0 }, { 164.0 }, { 165.0 } } } } } } } }, { { { { { { 166.0 } }, { { 167.0 }, { 168.0 }, { 169.0 } } }, { { 170.0, { { { { { 171.0 } }, { { 172.0 }, { 173.0 }, { 174.0 } } } } } }, { 175.0, { { { { { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } } } } }, { 180.0, { { { { { 181.0 } }, { { 182.0 }, { 183.0 }, { 184.0 } } } } } } } } } } }, { { { { { 185.0 } }, { { 186.0 }, { 187.0 }, { 188.0 } } }, { { 189.0, { { { { { 190.0 } }, { { 191.0 }, { 192.0 }, { 193.0 } } } } } }, { 194.0, { { { { { 195.0 } }, { { 196.0 }, { 197.0 }, { 198.0 } } } } } }, { 199.0, { { { { { 200.0 } }, { { 201.0 }, { 202.0 }, { 203.0 } } } } } } } }, { { { { { { 204.0 } }, { { 205.0 }, { 206.0 }, { 207.0 } } }, { { 208.0, { { { { { 209.0 } }, { { 210.0 }, { 211.0 }, { 212.0 } } } } } }, { 213.0, { { { { { 214.0 } }, { { 215.0 }, { 216.0 }, { 217.0 } } } } } }, { 218.0, { { { { { 219.0 } }, { { 220.0 }, { 221.0 }, { 222.0 } } } } } } } } } } } });
    double v3(223.0);
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
