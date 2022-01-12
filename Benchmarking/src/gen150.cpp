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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s1> p1;
    s4(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s0> p0;
    std::vector<std::vector<s3>> p1;
    s7(std::vector<s0> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s2> p0;
    s4 p1;
    s8(std::vector<s2> v0, s4 v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<s1>> f52(const std::vector<std::vector<s1>> &v0) {
    std::vector<std::vector<s1>> v4 = v0;
    const std::vector<s1> v2 = v0[2];
    v4[2] = v2;
    std::vector<s1> v1 = v2;
    const std::vector<std::vector<s1>> v7 { v1, v1, v2 };
    const std::vector<std::vector<s1>> v3 { v1, v1, v2, v2, v2, v1, v1 };
    std::vector<std::vector<s1>> v13 = v3;
    const std::vector<s1> v12 = v4[0];
    std::vector<std::vector<s1>> v15 = v7;
    const std::vector<s1> v8 = v13[6];
    const s1 v14 = v12[0];
    const std::vector<s1> v17 = v13[0];
    v13[1] = v2;
    const std::vector<std::vector<s0>> v30 = v14.p1;
    s1 v9 = v14;
    const std::vector<std::vector<s0>> v19 = v9.p1;
    const std::vector<s1> v18 = v13[0];
    std::vector<s1> v22 = v17;
    v15[0] = v18;
    v1[0] = v9;
    const std::vector<s0> v21 = v19[0];
    const std::vector<s0> v59 = v14.p0;
    const s1 v42(v59, v30);
    std::vector<s1> v23 = v18;
    std::vector<s0> v32 = v59;
    std::vector<std::vector<s0>> v33 = v19;
    v1[0] = v42;
    s1 v29 = v9;
    const std::vector<std::vector<s0>> v44 = v42.p1;
    v29.p0 = v59;
    const s1 v28 = v18[0];
    std::vector<std::vector<s0>> v47 = v30;
    s1 v58 = v14;
    const s1 v41 = v23[0];
    v29.p0 = v32;
    std::vector<std::vector<s0>> v51 = v19;
    v9.p1 = v51;
    std::vector<std::vector<s1>> v56 = v15;
    v47 = v44;
    v15[1] = v8;
    v23[0] = v58;
    v29.p1 = v44;
    const std::vector<s0> v60 = v33[0];
    v4[0] = v1;
    const std::vector<s0> v63 = v44[2];
    const std::vector<s0> v73 = v28.p0;
    const std::vector<s0> v54 = v44[2];
    const std::vector<std::vector<s0>> v78 = v41.p1;
    v15[2] = v2;
    v58.p0 = v60;
    v58.p0 = v63;
    const std::vector<std::vector<s0>> v112 = v29.p1;
    v58.p1 = v44;
    v1[0] = v42;
    v33[2] = v21;
    v58 = v42;
    v58.p1 = v112;
    const s1 v97(v54, v78);
    v33 = v47;
    v9.p1 = v78;
    v23[0] = v97;
    v56[1] = v22;
    v29.p0 = v60;
    v15[1] = v18;
    v58.p0 = v73;
    v4[1] = v2;
    v29.p0 = v32;
    v1[0] = v58;
    return v56;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1, const std::vector<s8> &v2, const std::vector<s7> &v3) {
    const std::vector<std::vector<s1>> v10 = f52(v0);
    const std::vector<s1> v21 = v10[0];
    const s1 v27 = v21[0];
    const std::vector<s0> v22 = v27.p0;
    const s0 v74 = v22[0];
    const std::vector<std::vector<double>> v69 = v74.p1;
    const std::vector<double> v65 = v69[0];
    const double v55 = v65[0];
    return v55;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } } }, { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } }, { { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } } }, { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } } } });
    double v1(36.0);
    std::vector<s8> v2({ { { { { { { { { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 } } } }, { { { { 43.0 }, { 44.0 } }, { { 45.0 } } } }, { { { { 46.0 }, { 47.0 } }, { { 48.0 } } } } } } } }, { { { { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { { { { 52.0 }, { 53.0 } }, { { 54.0 } } } }, { { { { { 55.0 }, { 56.0 } }, { { 57.0 } } } }, { { { { 58.0 }, { 59.0 } }, { { 60.0 } } } }, { { { { 61.0 }, { 62.0 } }, { { 63.0 } } } } } }, { { { { { 64.0 }, { 65.0 } }, { { 66.0 } } } }, { { { { { 67.0 }, { 68.0 } }, { { 69.0 } } } }, { { { { 70.0 }, { 71.0 } }, { { 72.0 } } } }, { { { { 73.0 }, { 74.0 } }, { { 75.0 } } } } } }, { { { { { 76.0 }, { 77.0 } }, { { 78.0 } } } }, { { { { { 79.0 }, { 80.0 } }, { { 81.0 } } } }, { { { { 82.0 }, { 83.0 } }, { { 84.0 } } } }, { { { { 85.0 }, { 86.0 } }, { { 87.0 } } } } } } } } }, { { { { { { { { 88.0 }, { 89.0 } }, { { 90.0 } } } }, { { { { { 91.0 }, { 92.0 } }, { { 93.0 } } } }, { { { { 94.0 }, { 95.0 } }, { { 96.0 } } } }, { { { { 97.0 }, { 98.0 } }, { { 99.0 } } } } } } } }, { { { { 100.0 }, { 101.0 } }, { { 102.0 } } }, { { { { { { 103.0 }, { 104.0 } }, { { 105.0 } } } }, { { { { { 106.0 }, { 107.0 } }, { { 108.0 } } } }, { { { { 109.0 }, { 110.0 } }, { { 111.0 } } } }, { { { { 112.0 }, { 113.0 } }, { { 114.0 } } } } } }, { { { { { 115.0 }, { 116.0 } }, { { 117.0 } } } }, { { { { { 118.0 }, { 119.0 } }, { { 120.0 } } } }, { { { { 121.0 }, { 122.0 } }, { { 123.0 } } } }, { { { { 124.0 }, { 125.0 } }, { { 126.0 } } } } } }, { { { { { 127.0 }, { 128.0 } }, { { 129.0 } } } }, { { { { { 130.0 }, { 131.0 } }, { { 132.0 } } } }, { { { { 133.0 }, { 134.0 } }, { { 135.0 } } } }, { { { { 136.0 }, { 137.0 } }, { { 138.0 } } } } } } } } } });
    std::vector<s7> v3({ { { { { { 139.0 }, { 140.0 } }, { { 141.0 } } }, { { { 142.0 }, { 143.0 } }, { { 144.0 } } }, { { { 145.0 }, { 146.0 } }, { { 147.0 } } } }, { { { { { { 148.0 }, { 149.0 } }, { { 150.0 } } }, { { { { { 151.0 }, { 152.0 } }, { { 153.0 } } } }, { { { { { 154.0 }, { 155.0 } }, { { 156.0 } } } }, { { { { 157.0 }, { 158.0 } }, { { 159.0 } } } }, { { { { 160.0 }, { 161.0 } }, { { 162.0 } } } } } } } }, { { { { { 163.0 }, { 164.0 } }, { { 165.0 } } }, { { { { { 166.0 }, { 167.0 } }, { { 168.0 } } } }, { { { { { 169.0 }, { 170.0 } }, { { 171.0 } } } }, { { { { 172.0 }, { 173.0 } }, { { 174.0 } } } }, { { { { 175.0 }, { 176.0 } }, { { 177.0 } } } } } } } } } }, { { { { { 178.0 }, { 179.0 } }, { { 180.0 } } }, { { { 181.0 }, { 182.0 } }, { { 183.0 } } }, { { { 184.0 }, { 185.0 } }, { { 186.0 } } } }, { { { { { { 187.0 }, { 188.0 } }, { { 189.0 } } }, { { { { { 190.0 }, { 191.0 } }, { { 192.0 } } } }, { { { { { 193.0 }, { 194.0 } }, { { 195.0 } } } }, { { { { 196.0 }, { 197.0 } }, { { 198.0 } } } }, { { { { 199.0 }, { 200.0 } }, { { 201.0 } } } } } } } }, { { { { { 202.0 }, { 203.0 } }, { { 204.0 } } }, { { { { { 205.0 }, { 206.0 } }, { { 207.0 } } } }, { { { { { 208.0 }, { 209.0 } }, { { 210.0 } } } }, { { { { 211.0 }, { 212.0 } }, { { 213.0 } } } }, { { { { 214.0 }, { 215.0 } }, { { 216.0 } } } } } } } } } } });
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
