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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    s2 p1;
    s3(std::vector<std::vector<s1>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<s3> p1;
    s4(s1 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    s5(s4 v0): p0(v0) { }
  };
  struct s7 {
    s2 p0;
    s5 p1;
    s7(s2 v0, s5 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s7 p0;
    std::vector<s7> p1;
    s8(s7 v0, std::vector<s7> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s8 p0;
    std::vector<s1> p1;
    s9(s8 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    s9 p0;
    s2 p1;
    s11(s9 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s13 {
    s11 p0;
    std::vector<s5> p1;
    s13(s11 v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  s4 f109(const s4 &v0) {
    const s1 v3 = v0.p0;
    s1 v6 = v3;
    s1 v7 = v6;
    v6 = v3;
    s1 v5 = v3;
    v5 = v6;
    s1 v4 = v7;
    const std::vector<s3> v11 = v0.p1;
    const s3 v9 = v11[0];
    const s2 v2 = v9.p1;
    const s0 v25 = v4.p1;
    s4 v17 = v0;
    v17.p0 = v7;
    v7.p0 = v25;
    s2 v21 = v2;
    v4 = v5;
    const s0 v28 = v21.p0;
    const s0 v16 = v7.p0;
    const s0 v23 = v21.p0;
    s0 v38 = v16;
    const std::vector<std::vector<double>> v62 = v25.p1;
    v21.p0 = v25;
    const std::vector<s3> v49 = v17.p1;
    v6.p1 = v28;
    v6.p0 = v23;
    const std::vector<std::vector<double>> v53 = v23.p0;
    const s0 v40(v53, v62);
    const s5 v57(v17);
    s5 v56 = v57;
    v5.p0 = v40;
    s5 v92 = v56;
    const s0 v75 = v21.p0;
    v7.p0 = v75;
    v7.p1 = v38;
    v92.p0 = v0;
    const s4 v142 = v92.p0;
    v17.p1 = v49;
    v21.p1 = v38;
    s4 v144 = v142;
    v38.p0 = v53;
    return v144;
  }
  s4 f100(const s4 &v0) {
    const s4 v7 = f109(v0);
    const std::vector<s3> v4 = v0.p1;
    const s1 v6 = v7.p0;
    s1 v8 = v6;
    s4 v3 = v7;
    const s4 v9 = f109(v3);
    s1 v5 = v6;
    const s4 v21 = f109(v9);
    v3.p1 = v4;
    const std::vector<s3> v1 = v3.p1;
    s4 v2 = v7;
    std::vector<s3> v13 = v1;
    const s3 v11 = v4[0];
    s3 v14 = v11;
    v13[0] = v14;
    const s4 v16 = f109(v21);
    s4 v19 = v7;
    v13[0] = v11;
    std::vector<s3> v24 = v1;
    const s3 v25 = v13[0];
    v3.p1 = v24;
    const s3 v26 = v4[0];
    const s3 v52 = v24[0];
    v3.p1 = v13;
    s3 v39 = v25;
    const s4 v47 = f109(v7);
    s4 v54 = v16;
    const s4 v30 = f109(v2);
    v2.p1 = v24;
    const std::vector<std::vector<s1>> v32 = v26.p0;
    v3.p1 = v1;
    const s3 v22 = v4[0];
    const s3 v38 = v13[0];
    const s3 v35 = v4[0];
    v14.p0 = v32;
    v8 = v5;
    v24[0] = v14;
    v24[0] = v22;
    v2 = v47;
    const std::vector<s3> v61 = v19.p1;
    v19.p0 = v5;
    const s3 v45 = v61[0];
    const s3 v40 = v4[0];
    v24[0] = v26;
    const s2 v31 = v26.p1;
    const s2 v84 = v40.p1;
    const s0 v71 = v8.p0;
    s2 v36 = v84;
    v8.p0 = v71;
    const s0 v58 = v31.p1;
    v54.p0 = v5;
    const s2 v78 = v52.p1;
    const s0 v41 = v6.p1;
    s1 v44 = v8;
    const s0 v77 = v8.p0;
    v24[0] = v35;
    s3 v67 = v39;
    v24[0] = v52;
    v3 = v30;
    v24[0] = v67;
    v13[0] = v45;
    v14.p0 = v32;
    const s0 v226 = v78.p0;
    v24[0] = v52;
    v44.p1 = v226;
    const s0 v140 = v5.p0;
    const s0 v75 = v36.p1;
    v3.p0 = v44;
    v36.p0 = v77;
    v3.p1 = v1;
    v67.p1 = v78;
    v5.p0 = v75;
    v24[0] = v26;
    v13[0] = v38;
    v44.p1 = v58;
    v44.p1 = v140;
    v39.p1 = v84;
    v8.p0 = v41;
    return v54;
  }
  s0 f68(const s0 &v0) {
    return v0;
  }
  s1 f49(const s1 &v0) {
    s1 v21 = v0;
    const s0 v13 = v21.p0;
    const s0 v31 = f68(v13);
    v21.p0 = v31;
    return v21;
  }
  s1 f32(const s1 &v0) {
    s1 v6 = v0;
    const s1 v2 = f49(v6);
    const std::vector<s1> v7 { v6, v6, v6, v2, v2, v0 };
    std::vector<s1> v4 = v7;
    const s1 v3 = f49(v0);
    std::vector<s1> v1 = v4;
    const std::vector<std::vector<s1>> v10 { v1, v7 };
    const s1 v5 = f49(v3);
    std::vector<s1> v19 = v4;
    v4[4] = v3;
    v1[3] = v6;
    const s0 v15 = v0.p0;
    const s0 v12 = f68(v15);
    s0 v14 = v12;
    v19[1] = v6;
    const s0 v16 = v5.p0;
    const s1 v11 = v19[5];
    std::vector<std::vector<s1>> v30 = v10;
    const std::vector<s1> v13 = v30[1];
    s0 v17 = v14;
    const s1 v20 = f49(v11);
    v6.p1 = v14;
    v4 = v13;
    v19[4] = v20;
    v6.p0 = v17;
    const s1 v47 = f49(v2);
    v6.p0 = v15;
    const s0 v27 = v5.p1;
    const s0 v35 = f68(v27);
    const s1 v174 = f49(v47);
    v4[1] = v47;
    const std::vector<std::vector<double>> v62 = v16.p1;
    const s1 v41 = f49(v174);
    v1[1] = v47;
    v6.p1 = v35;
    v14.p1 = v62;
    v19[5] = v41;
    s1 v94 = v20;
    return v94;
  }
  s5 f25(const s5 &v0) {
    const s4 v1 = v0.p0;
    const s4 v4 = f109(v1);
    s5 v62 = v0;
    v62.p0 = v4;
    return v62;
  }
  double f20(const double &v0, const s5 &v1) {
    const s5 v8 = f25(v1);
    double v5 = v0;
    const s4 v4 = v8.p0;
    const double v2 = v5 - v0;
    double v13 = v2;
    const s1 v20 = v4.p0;
    double v33 = v0;
    const s1 v43 = f49(v20);
    const s0 v36 = v43.p1;
    const std::vector<std::vector<double>> v51 = v36.p1;
    const std::vector<double> v39 = v51[0];
    const double v16 = v39[0];
    const double v40 = v13 - v16;
    v13 = v33;
    return v40;
  }
  s1 f16(const s1 &v0) {
    const s1 v4 = f49(v0);
    const std::vector<s1> v3 { v0, v4, v4, v4, v4, v4 };
    std::vector<s1> v8 = v3;
    const s1 v11 = v8[4];
    return v11;
  }
  s5 f5(const s5 &v0) {
    const s4 v3 = v0.p0;
    const s5 v4 = f25(v0);
    s5 v8 = v4;
    v8.p0 = v3;
    v8.p0 = v3;
    const s4 v19 = v4.p0;
    const s4 v16 = v8.p0;
    const s4 v15 = f109(v3);
    s5 v12 = v8;
    const s5 v36 = f25(v0);
    v8.p0 = v15;
    const s4 v27 = f109(v3);
    const std::vector<s4> v49 { v3, v3, v19, v15 };
    v8.p0 = v27;
    const s4 v29 = f109(v16);
    v12.p0 = v27;
    const s4 v60 = v49[0];
    v8.p0 = v60;
    v8.p0 = v19;
    s4 v42 = v15;
    const s5 v37 = f25(v36);
    const s4 v61 = v37.p0;
    v12.p0 = v27;
    v12.p0 = v29;
    v8.p0 = v61;
    v8.p0 = v61;
    v42 = v27;
    v12.p0 = v3;
    const s4 v101 = f100(v42);
    v8.p0 = v101;
    v12.p0 = v3;
    s5 v89 = v8;
    v12 = v89;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s13 &v0, const s13 &v1, const double &v2) {
    const s11 v6 = v0.p0;
    double v7 = v2;
    s13 v3 = v1;
    const std::vector<s5> v4 = v3.p1;
    v7 = v2;
    const s5 v5 = v4[0];
    const s4 v11 = v5.p0;
    const s5 v14 = v4[0];
    v3.p1 = v4;
    v3.p0 = v6;
    v3.p0 = v6;
    const s5 v30 = v4[1];
    v3.p0 = v6;
    v3.p1 = v4;
    const s4 v18 = v30.p0;
    v3 = v0;
    v7 = v2;
    s4 v12 = v11;
    const s1 v26 = v11.p0;
    s5 v49 = v14;
    const s1 v32 = f32(v26);
    s11 v20 = v6;
    v49.p0 = v18;
    s1 v50 = v32;
    const s1 v74 = f16(v26);
    const s1 v41 = f32(v74);
    s11 v75 = v20;
    v12.p0 = v26;
    const s5 v67 = f5(v49);
    v12.p0 = v74;
    v50 = v41;
    v12.p0 = v50;
    v12.p0 = v50;
    double v82 = v2;
    v49.p0 = v12;
    const double v220 = f20(v82, v67);
    v3.p0 = v75;
    const double v343 = v7 - v220;
    return v343;
  }
  int main() {
    s13 v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } } } } } }, { { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { { { { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 } } } } } }, { { { { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 } }, { { 46.0 }, { 47.0 } } } } } } } } } } }, { { { { { 48.0 } }, { { 49.0 }, { 50.0 } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } } }, { { { { 54.0 } }, { { 55.0 }, { 56.0 } } }, { { { 57.0 } }, { { 58.0 }, { 59.0 } } } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 } } }, { { { 63.0 } }, { { 64.0 }, { 65.0 } } } } }, { { { { { { { 66.0 } }, { { 67.0 }, { 68.0 } } }, { { { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { { { { { { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 } }, { { 76.0 }, { 77.0 } } } } } }, { { { { 78.0 } }, { { 79.0 }, { 80.0 } } }, { { { 81.0 } }, { { 82.0 }, { 83.0 } } } } } } } }, { { { { { { 84.0 } }, { { 85.0 }, { 86.0 } } }, { { { 87.0 } }, { { 88.0 }, { 89.0 } } } }, { { { { { { { { 90.0 } }, { { 91.0 }, { 92.0 } } }, { { { 93.0 } }, { { 94.0 }, { 95.0 } } } } } }, { { { { 96.0 } }, { { 97.0 }, { 98.0 } } }, { { { 99.0 } }, { { 100.0 }, { 101.0 } } } } } } } }, { { { { { { 102.0 } }, { { 103.0 }, { 104.0 } } }, { { { 105.0 } }, { { 106.0 }, { 107.0 } } } }, { { { { { { { { 108.0 } }, { { 109.0 }, { 110.0 } } }, { { { 111.0 } }, { { 112.0 }, { 113.0 } } } } } }, { { { { 114.0 } }, { { 115.0 }, { 116.0 } } }, { { { 117.0 } }, { { 118.0 }, { 119.0 } } } } } } } } } });
    s13 v1({ { { { { { { { { 120.0 } }, { { 121.0 }, { 122.0 } } }, { { { 123.0 } }, { { 124.0 }, { 125.0 } } } }, { { { { { { 126.0 } }, { { 127.0 }, { 128.0 } } }, { { { 129.0 } }, { { 130.0 }, { 131.0 } } } }, { { { { { { { { 132.0 } }, { { 133.0 }, { 134.0 } } }, { { { 135.0 } }, { { 136.0 }, { 137.0 } } } } } }, { { { { 138.0 } }, { { 139.0 }, { 140.0 } } }, { { { 141.0 } }, { { 142.0 }, { 143.0 } } } } } } } } }, { { { { { { 144.0 } }, { { 145.0 }, { 146.0 } } }, { { { 147.0 } }, { { 148.0 }, { 149.0 } } } }, { { { { { { 150.0 } }, { { 151.0 }, { 152.0 } } }, { { { 153.0 } }, { { 154.0 }, { 155.0 } } } }, { { { { { { { { 156.0 } }, { { 157.0 }, { 158.0 } } }, { { { 159.0 } }, { { 160.0 }, { 161.0 } } } } } }, { { { { 162.0 } }, { { 163.0 }, { 164.0 } } }, { { { 165.0 } }, { { 166.0 }, { 167.0 } } } } } } } } } } }, { { { { { 168.0 } }, { { 169.0 }, { 170.0 } } }, { { { 171.0 } }, { { 172.0 }, { 173.0 } } } }, { { { { 174.0 } }, { { 175.0 }, { 176.0 } } }, { { { 177.0 } }, { { 178.0 }, { 179.0 } } } } } }, { { { { 180.0 } }, { { 181.0 }, { 182.0 } } }, { { { 183.0 } }, { { 184.0 }, { 185.0 } } } } }, { { { { { { { 186.0 } }, { { 187.0 }, { 188.0 } } }, { { { 189.0 } }, { { 190.0 }, { 191.0 } } } }, { { { { { { { { 192.0 } }, { { 193.0 }, { 194.0 } } }, { { { 195.0 } }, { { 196.0 }, { 197.0 } } } } } }, { { { { 198.0 } }, { { 199.0 }, { 200.0 } } }, { { { 201.0 } }, { { 202.0 }, { 203.0 } } } } } } } }, { { { { { { 204.0 } }, { { 205.0 }, { 206.0 } } }, { { { 207.0 } }, { { 208.0 }, { 209.0 } } } }, { { { { { { { { 210.0 } }, { { 211.0 }, { 212.0 } } }, { { { 213.0 } }, { { 214.0 }, { 215.0 } } } } } }, { { { { 216.0 } }, { { 217.0 }, { 218.0 } } }, { { { 219.0 } }, { { 220.0 }, { 221.0 } } } } } } } }, { { { { { { 222.0 } }, { { 223.0 }, { 224.0 } } }, { { { 225.0 } }, { { 226.0 }, { 227.0 } } } }, { { { { { { { { 228.0 } }, { { 229.0 }, { 230.0 } } }, { { { 231.0 } }, { { 232.0 }, { 233.0 } } } } } }, { { { { 234.0 } }, { { 235.0 }, { 236.0 } } }, { { { 237.0 } }, { { 238.0 }, { 239.0 } } } } } } } } } });
    double v2(240.0);
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
