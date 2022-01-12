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
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s1 p2;
    std::vector<s1> p3;
    s2(std::vector<s0> v0, std::vector<std::vector<s1>> v1, s1 v2, std::vector<s1> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  std::vector<s2> f80(const std::vector<s2> &v0) {
    const s2 v6 = v0[1];
    std::vector<s2> v20 = v0;
    std::vector<s2> v16 = v20;
    v20[1] = v6;
    return v16;
  }
  s2 f79(const s2 &v0) {
    const std::vector<std::vector<s1>> v5 = v0.p1;
    s2 v4 = v0;
    const std::vector<std::vector<s1>> v3 = v0.p1;
    s2 v1 = v0;
    const std::vector<s1> v7 = v3[0];
    std::vector<s1> v8 = v7;
    v1.p1 = v3;
    const s1 v6 = v8[0];
    v4.p2 = v6;
    v1.p2 = v6;
    v8[0] = v6;
    const std::vector<s1> v30 = v1.p3;
    v1.p1 = v5;
    v1.p3 = v30;
    const s1 v22 = v30[1];
    v8[0] = v22;
    return v4;
  }
  s2 f72(const s2 &v0) {
    const std::vector<s2> v4 { v0, v0 };
    const s2 v6 = f79(v0);
    std::vector<s2> v1 = v4;
    const std::vector<s2> v2 = f80(v1);
    s2 v3 = v0;
    s2 v7 = v6;
    v7 = v6;
    std::vector<s2> v9 = v2;
    const std::vector<std::vector<s1>> v8 = v0.p1;
    const std::vector<s2> v20 = f80(v9);
    const std::vector<s1> v22 = v0.p3;
    std::vector<s1> v10 = v22;
    const std::vector<s2> v14 = f80(v2);
    const std::vector<s1> v13 = v8[0];
    v1[1] = v3;
    v9 = v20;
    const s2 v72 = v14[1];
    const s1 v57 = v22[1];
    const s1 v37 = v13[0];
    const s2 v51 = f79(v0);
    const s2 v21 = v9[0];
    v1[1] = v7;
    v10[0] = v57;
    v7.p3 = v10;
    v7.p2 = v37;
    const std::vector<s0> v82 = v72.p0;
    v3.p3 = v10;
    v1[1] = v51;
    v3.p1 = v8;
    v7.p0 = v82;
    const s2 v122 = f79(v21);
    v9[0] = v72;
    v1[1] = v7;
    return v122;
  }
  s0 f70(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v1 = v4.p0;
    std::vector<std::vector<double>> v5 = v1;
    const std::vector<std::vector<double>> v8 = v0.p1;
    v4.p0 = v1;
    const std::vector<double> v7 = v2[1];
    const s0 v6(v8, v5);
    const std::vector<std::vector<double>> v3 = v4.p1;
    v5[1] = v7;
    const std::vector<std::vector<double>> v29 = v0.p0;
    std::vector<std::vector<double>> v9 = v2;
    const std::vector<std::vector<double>> v13 = v6.p1;
    const std::vector<double> v16 = v5[0];
    const std::vector<std::vector<double>> v19 = v0.p0;
    const std::vector<std::vector<double>> v25 = v4.p0;
    const double v15 = v7[0];
    v9[1] = v16;
    v5[1] = v7;
    s0 v21 = v6;
    v21.p1 = v9;
    const std::vector<std::vector<double>> v14 = v4.p0;
    const std::vector<std::vector<double>> v43 = v6.p1;
    s0 v35 = v6;
    const std::vector<std::vector<double>> v22 = v6.p0;
    const std::vector<std::vector<std::vector<double>>> v24 { v29, v25, v1, v29, v1, v8 };
    std::vector<std::vector<std::vector<double>>> v56 = v24;
    const std::vector<std::vector<double>> v30 = v56[3];
    const std::vector<std::vector<double>> v18 = v35.p1;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v49 { v56, v56, v24, v56 };
    std::vector<double> v45 = v16;
    v9[0] = v45;
    v56[3] = v14;
    v56[1] = v22;
    const std::vector<std::vector<double>> v46 = v4.p0;
    v4.p0 = v18;
    std::vector<std::vector<double>> v44 = v8;
    v9[1] = v7;
    v45[0] = v15;
    v21.p0 = v30;
    const std::vector<std::vector<std::vector<double>>> v41 = v49[2];
    v35.p1 = v18;
    std::vector<std::vector<std::vector<double>>> v33 = v24;
    std::vector<std::vector<std::vector<std::vector<double>>>> v51 = v49;
    v4.p0 = v19;
    const std::vector<std::vector<double>> v40 = v6.p0;
    const std::vector<std::vector<double>> v32 = v35.p0;
    v33 = v41;
    const std::vector<std::vector<std::vector<double>>> v76 = v51[3];
    v4.p0 = v32;
    v4.p1 = v46;
    v4.p0 = v40;
    v35.p1 = v14;
    v21.p0 = v18;
    v35.p1 = v44;
    v9[0] = v45;
    v45[0] = v15;
    const s0 v55(v25, v3);
    v4.p1 = v43;
    v33[4] = v13;
    const std::vector<std::vector<double>> v102 = v0.p1;
    const std::vector<std::vector<double>> v65 = v76[2];
    std::vector<std::vector<std::vector<double>>> v94 = v33;
    const std::vector<std::vector<double>> v143 = v21.p0;
    const s0 v210(v143, v65);
    v4.p1 = v102;
    v35 = v55;
    v51[2] = v94;
    return v210;
  }
  s1 f69(const s1 &v0) {
    const std::vector<s0> v7 = v0.p1;
    const s0 v2 = v7[0];
    const std::vector<s0> v3 { v2, v2, v2, v2, v2 };
    const std::vector<s0> v5 = v0.p1;
    const s0 v12 = v3[1];
    const s1 v50(v12, v5);
    const std::vector<s1> v142 { v50 };
    std::vector<s1> v96 = v142;
    const s1 v136 = v96[0];
    return v136;
  }
  s0 f49(const s2 &v0, const s0 &v1, const s0 &v2) {
    const s0 v3 = f70(v1);
    const std::vector<s0> v4 = v0.p0;
    s0 v6 = v2;
    const std::vector<std::vector<double>> v13 = v6.p0;
    std::vector<s0> v7 = v4;
    const s0 v11 = v7[0];
    const std::vector<s0> v9 = v0.p0;
    s0 v29 = v3;
    const s0 v14 = v9[0];
    v7[0] = v6;
    std::vector<std::vector<double>> v12 = v13;
    v29.p0 = v12;
    const std::vector<std::vector<double>> v28 = v3.p1;
    const std::vector<std::vector<double>> v36 = v14.p0;
    const s0 v21 = f70(v11);
    const std::vector<std::vector<double>> v57 = v21.p1;
    const s0 v19 = v4[0];
    v29.p1 = v57;
    s0 v47 = v29;
    std::vector<std::vector<double>> v49 = v28;
    const s0 v30 = v9[0];
    v29.p1 = v13;
    std::vector<std::vector<double>> v120 = v49;
    v29.p0 = v120;
    const std::vector<std::vector<double>> v81 = v30.p1;
    v29.p1 = v57;
    v47.p1 = v81;
    std::vector<std::vector<double>> v53 = v120;
    v47 = v30;
    v47.p1 = v36;
    v7[0] = v19;
    const std::vector<double> v84 = v120[1];
    v29.p1 = v53;
    v29.p0 = v81;
    const std::vector<std::vector<double>> v80 = v1.p1;
    v29.p1 = v80;
    v29.p0 = v57;
    std::vector<double> v104 = v84;
    v120[0] = v84;
    v49[0] = v104;
    return v47;
  }
  s2 f46(const s2 &v0) {
    const std::vector<std::vector<s1>> v7 = v0.p1;
    const std::vector<s0> v5 = v0.p0;
    const std::vector<s0> v2 = v0.p0;
    const std::vector<s1> v8 = v0.p3;
    const s1 v4 = v8[0];
    const s1 v14 = f69(v4);
    std::vector<s1> v10 = v8;
    const s2 v11 = f72(v0);
    const s1 v26 = v10[0];
    v10[1] = v26;
    const std::vector<s1> v30 = v7[0];
    const s1 v18 = f69(v26);
    s2 v16 = v0;
    const s2 v17 = f72(v16);
    v16.p1 = v7;
    v16.p2 = v18;
    const s1 v24 = v30[0];
    const s0 v21 = v14.p0;
    const std::vector<s1> v23 = v17.p3;
    v10[0] = v4;
    v16.p2 = v24;
    const std::vector<s0> v29 = v11.p0;
    const s2 v44 = f79(v17);
    v10[0] = v24;
    v16.p0 = v29;
    std::vector<s0> v36 = v2;
    const s0 v35 = v5[0];
    const s0 v34 = f49(v0, v21, v35);
    v16.p0 = v2;
    v16.p0 = v36;
    v16.p3 = v10;
    v36[0] = v34;
    const s2 v146 = f72(v44);
    v16.p3 = v10;
    v16.p1 = v7;
    v16.p3 = v23;
    return v146;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s2> &v1, const double &v2) {
    const s0 v5 = v0.p0;
    std::vector<s2> v4 = v1;
    const s2 v9 = v1[2];
    const s2 v7 = f46(v9);
    const s2 v13 = v4[2];
    s0 v11 = v5;
    const s2 v19 = v1[1];
    v4[1] = v13;
    const s1 v15 = v13.p2;
    const std::vector<std::vector<double>> v40 = v11.p0;
    v11.p1 = v40;
    const std::vector<double> v10 = v40[1];
    v11.p1 = v40;
    const double v26 = v10[0];
    v11.p0 = v40;
    const std::vector<std::vector<double>> v29 = v5.p0;
    v4[0] = v19;
    v11.p0 = v40;
    v4[1] = v13;
    v4[2] = v7;
    const s0 v30 = v15.p0;
    const std::vector<std::vector<double>> v148 = v30.p1;
    v11.p1 = v40;
    v11.p0 = v29;
    v11.p1 = v148;
    v11.p0 = v148;
    return v26;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } });
    std::vector<s2> v1({ { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } } }, { { { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } } }, { { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } }, { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } } } } } }, { { { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } } } }, { { { { { { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } }, { { { { 92.0 }, { 93.0 } }, { { 94.0 }, { 95.0 } } }, { { { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } } } } } } }, { { { { 104.0 }, { 105.0 } }, { { 106.0 }, { 107.0 } } }, { { { { 108.0 }, { 109.0 } }, { { 110.0 }, { 111.0 } } }, { { { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } } }, { { { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } }, { { { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 } } }, { { { { 124.0 }, { 125.0 } }, { { 126.0 }, { 127.0 } } }, { { { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } } }, { { { 132.0 }, { 133.0 } }, { { 134.0 }, { 135.0 } } } } }, { { { { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } }, { { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 } } }, { { { 144.0 }, { 145.0 } }, { { 146.0 }, { 147.0 } } }, { { { 148.0 }, { 149.0 } }, { { 150.0 }, { 151.0 } } } } } } }, { { { { { 152.0 }, { 153.0 } }, { { 154.0 }, { 155.0 } } } }, { { { { { { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } }, { { { { 160.0 }, { 161.0 } }, { { 162.0 }, { 163.0 } } }, { { { 164.0 }, { 165.0 } }, { { 166.0 }, { 167.0 } } }, { { { 168.0 }, { 169.0 } }, { { 170.0 }, { 171.0 } } } } } } }, { { { { 172.0 }, { 173.0 } }, { { 174.0 }, { 175.0 } } }, { { { { 176.0 }, { 177.0 } }, { { 178.0 }, { 179.0 } } }, { { { 180.0 }, { 181.0 } }, { { 182.0 }, { 183.0 } } }, { { { 184.0 }, { 185.0 } }, { { 186.0 }, { 187.0 } } } } }, { { { { { 188.0 }, { 189.0 } }, { { 190.0 }, { 191.0 } } }, { { { { 192.0 }, { 193.0 } }, { { 194.0 }, { 195.0 } } }, { { { 196.0 }, { 197.0 } }, { { 198.0 }, { 199.0 } } }, { { { 200.0 }, { 201.0 } }, { { 202.0 }, { 203.0 } } } } }, { { { { 204.0 }, { 205.0 } }, { { 206.0 }, { 207.0 } } }, { { { { 208.0 }, { 209.0 } }, { { 210.0 }, { 211.0 } } }, { { { 212.0 }, { 213.0 } }, { { 214.0 }, { 215.0 } } }, { { { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } } } } } } } });
    double v2(220.0);
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
