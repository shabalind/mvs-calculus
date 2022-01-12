  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
    var p2: s2
  }
  struct s10 {
    var p0: [[s2]]
    var p1: s3
  }
  func f22(_ v0: s3) -> s3 {
    let v5: s2 = v0.p2
    var v33: s3 = v0
    let v105: s0 = v5.p1
    v33.p0 = v105
    return v33
  }
  func f16(_ v0: s2, _ v1: s1) -> s2 {
    var v8: s2 = v0
    return v8
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: s10, _ v2: Double) -> Double {
    var v6: s10 = v1
    let v5: [[s2]] = v6.p0
    let v4: s3 = v1.p1
    let v21: s3 = f22(v4)
    let v13: s3 = f22(v21)
    let v10: s3 = f22(v13)
    let v15: s3 = f22(v10)
    let v23: [s2] = v5[0]
    v6.p1 = v15
    let v18: s3 = f22(v4)
    let v29: s1 = v4.p1
    v6.p1 = v18
    v6.p1 = v10
    let v32: s2 = v23[0]
    v6.p0 = v5
    let v68: [[s2]] = v6.p0
    let v33: s3 = v6.p1
    let v73: s2 = f16(v32, v29)
    v6.p0 = v5
    v6.p0 = v68
    let v42: s0 = v73.p1
    v6.p0 = v5
    let v218: [[Double]] = v42.p0
    let v40: [Double] = v218[1]
    v6.p1 = v4
    v6.p1 = v33
    let v110: Double = v40[0]
    return v110
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s1(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])), p2: s2(p0: s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])))], [s3(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p1: s1(p0: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])), p2: s2(p0: s1(p0: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), p1: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])))]]
    let v1: s10 = s10(p0: [[s2(p0: s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), p1: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]])), p1: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]))]], p1: s3(p0: s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]), p1: s1(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]), p1: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]])), p2: s2(p0: s1(p0: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]]), p1: s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]])), p1: s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]]))))
    let v2: Double = 105.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 105.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
