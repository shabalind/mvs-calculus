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
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [[s1]]
    var p1: s2
  }
  func f63(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v2
    var v3: Double = v4
    var v1: Double = v3
    var v5: Double = v3
    var v11: Double = v1
    v4 = v1
    var v8: Double = v5
    v8 = v3
    var v18: Double = v8
    let v21: [Double] = [v11, v3, v3, v18, v8]
    let v25: Double = v21[3]
    return v25
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    var v7: Double = v1
    var v12: Double = v7
    let v15: Double = v12 / v12
    let v22: Double = f63(v1)
    var v26: Double = v22
    let v56: Double = v26 + v15
    return v56
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]))], [s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]))], [s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))]], p1: s2(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p1: s1(p0: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]))))], [s3(p0: [[s1(p0: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), p1: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]))], [s1(p0: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]))], [s1(p0: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]), p1: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]))]], p1: s2(p0: s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]), p1: s1(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]), p1: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]))))]]
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
