  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s1> p1;
    s4(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s4> p0;
    s4 p1;
    s2 p2;
    s5(std::vector<s4> v0, s4 v1, s2 v2): p0(v0), p1(v1), p2(v2) { }
  };
  std::vector<s4> f43(const std::vector<s4> &v0) {
    std::vector<s4> v7 = v0;
    std::vector<s4> v5 = v7;
    std::vector<s4> v4 = v5;
    std::vector<s4> v1 = v5;
    const s4 v6 = v1[1];
    const s0 v8 = v6.p0;
    s4 v12 = v6;
    const s4 v14 = v5[0];
    v5[0] = v12;
    v12.p0 = v8;
    v12.p0 = v8;
    v12.p0 = v8;
    v12.p0 = v8;
    v5 = v4;
    const s0 v58 = v14.p0;
    const s4 v36 = v4[1];
    const s0 v54 = v6.p0;
    v7[0] = v36;
    const s4 v56 = v5[1];
    const std::vector<s1> v43 = v6.p1;
    v12.p1 = v43;
    const std::vector<s1> v38 = v12.p1;
    std::vector<s4> v51 = v1;
    v12.p1 = v43;
    v12.p0 = v58;
    v12.p0 = v54;
    v12.p1 = v38;
    v51[1] = v56;
    return v51;
  }
  s5 f42(const s5 &v0, const s0 &v1) {
    s5 v6 = v0;
    s5 v5 = v0;
    const std::vector<s5> v2 { v6 };
    const s4 v13 = v6.p1;
    v6.p1 = v13;
    v6 = v0;
    s4 v8 = v13;
    const std::vector<s1> v14 = v8.p1;
    v6.p1 = v8;
    std::vector<s5> v12 = v2;
    v12 = v2;
    v12[0] = v5;
    v8.p1 = v14;
    v12 = v2;
    const s5 v110 = v12[0];
    return v110;
  }
  s2 f41(const s2 &v0, const s0 &v1) {
    const s1 v2 = v0.p0;
    const std::vector<std::vector<s0>> v30 = v0.p1;
    const s2 v48(v2, v30);
    s2 v33 = v48;
    const std::vector<s2> v62 { v0, v33, v33, v33, v33, v33, v33 };
    const s2 v110 = v62[3];
    return v110;
  }
  s1 f38(const s1 &v0) {
    s1 v7 = v0;
    s1 v4 = v0;
    s1 v3 = v4;
    s1 v6 = v0;
    const std::vector<s0> v2 = v3.p1;
    const std::vector<s0> v9 = v6.p0;
    std::vector<s0> v1 = v2;
    const s0 v10 = v2[0];
    std::vector<s0> v8 = v1;
    const s0 v18 = v9[1];
    const std::vector<std::vector<double>> v32 = v10.p0;
    const std::vector<s0> v20 = v6.p0;
    const std::vector<s0> v12 = v7.p0;
    s0 v14 = v10;
    const s1 v21(v20, v8);
    const s0 v34 = v8[1];
    std::vector<s0> v37 = v9;
    v7.p0 = v12;
    v14.p0 = v32;
    const s0 v15 = v8[0];
    s0 v52 = v18;
    v8[1] = v52;
    v6.p1 = v1;
    v1[1] = v34;
    v8[1] = v18;
    v4.p1 = v1;
    s1 v40 = v21;
    v4.p0 = v12;
    const std::vector<s0> v43 = v6.p0;
    v6.p0 = v37;
    v37[1] = v15;
    const std::vector<s0> v41 = v0.p1;
    v37[1] = v34;
    v3.p1 = v1;
    v4.p0 = v37;
    v3.p1 = v1;
    v4.p0 = v43;
    v8[0] = v18;
    std::vector<s0> v122 = v41;
    v40.p1 = v122;
    v40.p1 = v41;
    const std::vector<s1> v90 { v0, v3, v4, v40, v0, v21, v21 };
    v122[1] = v14;
    std::vector<s1> v81 = v90;
    const s1 v83 = v81[1];
    return v83;
  }
  s1 f37(const s0 &v0, const s1 &v1) {
    s1 v5 = v1;
    const s1 v20 = f38(v5);
    return v20;
  }
  s1 f35(const s1 &v0) {
    const s1 v7 = f38(v0);
    const s1 v6 = f38(v0);
    const s1 v3 = f38(v0);
    s1 v2 = v7;
    const std::vector<s1> v4 { v3, v2, v7 };
    const s1 v5 = f38(v2);
    const std::vector<s0> v1 = v5.p0;
    v2.p0 = v1;
    const s1 v9 = f38(v6);
    v2.p0 = v1;
    const std::vector<std::vector<s0>> v12 { v1, v1, v1 };
    const s0 v21 = v1[0];
    const std::vector<s0> v31 = v12[0];
    const s4 v18(v21, v4);
    v2.p0 = v31;
    const std::vector<s1> v47 = v18.p1;
    const s1 v59 = v47[2];
    v2 = v59;
    const std::vector<s0> v38 = v9.p0;
    const s1 v34 = v47[2];
    v2.p0 = v38;
    v2.p0 = v38;
    return v34;
  }
  s5 f32(const std::vector<s1> &v0, const s5 &v1) {
    const s4 v4 = v1.p1;
    s4 v6 = v4;
    const s1 v2 = v0[0];
    const s1 v3 = f35(v2);
    const s0 v5 = v6.p0;
    const s1 v10 = f38(v2);
    s5 v11 = v1;
    s5 v8 = v1;
    const std::vector<s1> v20 = v4.p1;
    v8.p1 = v6;
    v8.p1 = v4;
    std::vector<s1> v15 = v20;
    const std::vector<s1> v13 = v4.p1;
    s0 v24 = v5;
    v15[1] = v2;
    const s2 v17 = v11.p2;
    v15[0] = v10;
    v15[0] = v10;
    v15[0] = v10;
    const s1 v16 = v20[2];
    v15[2] = v3;
    v11.p2 = v17;
    const s2 v33 = f41(v17, v5);
    v6.p0 = v24;
    v8.p2 = v33;
    std::vector<s1> v32 = v15;
    const s0 v69 = v6.p0;
    s4 v37 = v4;
    v11.p1 = v37;
    const std::vector<s4> v53 = v8.p0;
    v6.p1 = v32;
    const std::vector<std::vector<double>> v58 = v69.p0;
    std::vector<s1> v39 = v0;
    v6.p0 = v5;
    v39[0] = v16;
    const s5 v113(v53, v37, v33);
    v8.p1 = v4;
    v6.p0 = v24;
    v32[2] = v16;
    v15[0] = v16;
    v8.p0 = v53;
    v6 = v4;
    const s1 v215 = v39[0];
    v15[0] = v215;
    v24.p0 = v58;
    v6.p1 = v13;
    return v113;
  }
  s5 f24(const s5 &v0) {
    s5 v7 = v0;
    s5 v5 = v7;
    const s2 v3 = v5.p2;
    s5 v1 = v5;
    const std::vector<std::vector<s0>> v2 = v3.p1;
    const std::vector<s0> v21 = v2[0];
    v7 = v0;
    const s0 v10 = v21[0];
    v5.p2 = v3;
    const s2 v11 = f41(v3, v10);
    v7.p2 = v11;
    s0 v9 = v10;
    v7 = v1;
    const std::vector<std::vector<double>> v8 = v9.p0;
    const std::vector<s4> v13 = v0.p0;
    v5.p0 = v13;
    std::vector<s4> v16 = v13;
    const s0 v12 = v21[0];
    const s0 v15 = v21[0];
    const s5 v29 = f42(v7, v12);
    std::vector<std::vector<double>> v17 = v8;
    const std::vector<double> v20 = v17[0];
    const s4 v26 = v29.p1;
    v7.p0 = v13;
    const s2 v35 = f41(v11, v9);
    const s2 v36 = f41(v35, v15);
    const std::vector<s4> v32 = f43(v16);
    v5.p0 = v32;
    const s2 v31 = v5.p2;
    s4 v23 = v26;
    v7.p2 = v35;
    v1.p2 = v36;
    const std::vector<s4> v55 = f43(v13);
    std::vector<s4> v50 = v13;
    std::vector<double> v74 = v20;
    v5.p2 = v36;
    v50[1] = v23;
    s5 v86 = v0;
    v16 = v55;
    const std::vector<double> v97 = v8[1];
    v86.p1 = v23;
    v17[1] = v97;
    const std::vector<s4> v64 = f43(v13);
    v86.p2 = v31;
    const s4 v84 = v50[0];
    v9.p0 = v17;
    v17[2] = v74;
    const std::vector<s4> v91 = f43(v32);
    v5.p1 = v84;
    v16 = v64;
    v5.p0 = v91;
    const s5 v106 = f42(v86, v9);
    return v106;
  }
  std::vector<s1> f11(const std::vector<s1> &v0) {
    std::vector<s1> v5 = v0;
    v5 = v0;
    std::vector<s1> v3 = v5;
    const s1 v4 = v5[2];
    const s1 v11 = f38(v4);
    std::vector<s1> v8 = v3;
    v3[0] = v11;
    v5[0] = v4;
    std::vector<s1> v20 = v8;
    return v20;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    s5 v7 = v0;
    const s5 v5 = f24(v0);
    const s5 v2 = f24(v5);
    const s4 v6 = v7.p1;
    const std::vector<s1> v4 = v6.p1;
    s5 v12 = v7;
    s4 v8 = v6;
    const s0 v9 = v6.p0;
    const std::vector<s1> v13 = v6.p1;
    s0 v18 = v9;
    const s0 v15 = v8.p0;
    const std::vector<s1> v14 = f11(v13);
    const s4 v19 = v12.p1;
    s0 v32 = v9;
    const s1 v25 = v13[2];
    const s1 v31 = f37(v32, v25);
    const std::vector<s1> v20 = f11(v14);
    s4 v16 = v19;
    const s1 v34 = v13[0];
    const std::vector<s1> v26 { v31 };
    const s1 v45 = v4[2];
    const s1 v28 = v4[1];
    std::vector<s1> v42 = v20;
    std::vector<s1> v33 = v26;
    v16.p1 = v4;
    v42[1] = v31;
    v42 = v14;
    const s2 v49 = v12.p2;
    v16.p1 = v13;
    const s2 v92 = f41(v49, v15);
    std::vector<s1> v52 = v26;
    const s1 v41 = f38(v34);
    v12.p2 = v92;
    const s1 v56 = f38(v25);
    std::vector<s1> v51 = v13;
    v33[0] = v28;
    v16.p1 = v4;
    s2 v37 = v49;
    const s5 v50 = f32(v33, v12);
    v52[0] = v25;
    const std::vector<std::vector<double>> v53 = v18.p0;
    v8.p1 = v51;
    std::vector<std::vector<double>> v43 = v53;
    v52[0] = v25;
    s4 v72 = v16;
    v42[0] = v56;
    std::vector<std::vector<double>> v47 = v43;
    const s1 v97 = f38(v45);
    s4 v74 = v72;
    std::vector<std::vector<double>> v98 = v47;
    const s1 v104 = v37.p0;
    v7.p2 = v37;
    const s0 v73 = v72.p0;
    v42[2] = v56;
    std::vector<std::vector<double>> v105 = v98;
    v12.p2 = v92;
    v42[0] = v41;
    v8.p1 = v42;
    v12 = v2;
    v42[0] = v31;
    const std::vector<double> v125 = v105[0];
    v52[0] = v104;
    v32.p0 = v105;
    v33[0] = v97;
    v8.p1 = v51;
    v98[2] = v125;
    const std::vector<double> v151 = v105[1];
    v52[0] = v56;
    v12 = v50;
    const double v120 = v151[0];
    const std::vector<s1> v247 = v74.p1;
    v72.p1 = v247;
    v105[0] = v125;
    v8.p0 = v73;
    const s1 v187 = v52[0];
    v51[2] = v187;
    return v120;
  }
  int main() {
    s5 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } }, { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } }, { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } } } }, { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } } }, { { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } } }, { { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } }, { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } } } }, { { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } }, { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } } }, { { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } } }, { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } } } } } } } }, { { { { 128.0 }, { 129.0 }, { 130.0 } }, { { 131.0 } } }, { { { { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 } } }, { { { 136.0 }, { 137.0 }, { 138.0 } }, { { 139.0 } } } }, { { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 } } }, { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 } } }, { { { 148.0 }, { 149.0 }, { 150.0 } }, { { 151.0 } } } } }, { { { { { 152.0 }, { 153.0 }, { 154.0 } }, { { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 } } } }, { { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 } } }, { { { 164.0 }, { 165.0 }, { 166.0 } }, { { 167.0 } } }, { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 } } } } }, { { { { { 172.0 }, { 173.0 }, { 174.0 } }, { { 175.0 } } }, { { { 176.0 }, { 177.0 }, { 178.0 } }, { { 179.0 } } } }, { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 } } }, { { { 184.0 }, { 185.0 }, { 186.0 } }, { { 187.0 } } }, { { { 188.0 }, { 189.0 }, { 190.0 } }, { { 191.0 } } } } } } }, { { { { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 } } }, { { { 196.0 }, { 197.0 }, { 198.0 } }, { { 199.0 } } } }, { { { { 200.0 }, { 201.0 }, { 202.0 } }, { { 203.0 } } }, { { { 204.0 }, { 205.0 }, { 206.0 } }, { { 207.0 } } }, { { { 208.0 }, { 209.0 }, { 210.0 } }, { { 211.0 } } } } }, { { { { { 212.0 }, { 213.0 }, { 214.0 } }, { { 215.0 } } } }, { { { { 216.0 }, { 217.0 }, { 218.0 } }, { { 219.0 } } } }, { { { { 220.0 }, { 221.0 }, { 222.0 } }, { { 223.0 } } } } } } });
    double v1(224.0);
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
