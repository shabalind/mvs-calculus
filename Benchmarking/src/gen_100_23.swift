  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  struct s6 {
    var p0: [s1]
    var p1: s3
  }
  struct s7 {
    var p0: s3
    var p1: [s6]
  }
  func f17(_ v0: Double) -> Double {
    var v3: Double = v0
    var v2: Double = v0
    var v7: Double = v0
    var v6: Double = v7
    var v8: Double = v6
    var v4: Double = v6
    let v5: Double = v7 - v2
    var v10: Double = v3
    var v1: Double = v10
    var v11: Double = v7
    var v12: Double = v6
    var v9: Double = v12
    var v13: Double = v5
    var v18: Double = v12
    var v15: Double = v11
    var v20: Double = v3
    let v14: [Double] = [v18, v2, v7, v6, v6, v15, v20]
    var v17: [Double] = v14
    v17[6] = v13
    v17[2] = v1
    var v40: Double = v18
    var v29: [Double] = v17
    var v25: [Double] = v29
    v40 = v7
    v29[1] = v40
    let v55: [[Double]] = [v14, v25, v17, v25, v29]
    let v57: [Double] = v55[3]
    v17[3] = v9
    v17[4] = v4
    v17[3] = v8
    v25[4] = v20
    let v124: Double = v57[5]
    v29[4] = v11
    return v124
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v28: Double = v1 + v1
    let v34: Double = f17(v28)
    var v20: Double = v34
    let v19: Double = f17(v34)
    let v31: [Double] = [v20, v1, v19, v20, v34]
    var v44: [Double] = v31
    let v67: Double = v44[0]
    return v67
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: s3(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]), p1: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]), p1: [s6(p0: [s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]), s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])]), s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), p1: [s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])])], p1: s3(p0: s1(p0: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), p1: [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]), p1: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]), s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]])])), s6(p0: [s1(p0: s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]]), p1: [s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])]), s1(p0: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]]), p1: [s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])]), s1(p0: s0(p0: [[90.0], [91.0]], p1: [[92.0], [93.0], [94.0]]), p1: [s0(p0: [[95.0], [96.0]], p1: [[97.0], [98.0], [99.0]])])], p1: s3(p0: s1(p0: s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0], [104.0]]), p1: [s0(p0: [[105.0], [106.0]], p1: [[107.0], [108.0], [109.0]])]), p1: [s0(p0: [[110.0], [111.0]], p1: [[112.0], [113.0], [114.0]]), s0(p0: [[115.0], [116.0]], p1: [[117.0], [118.0], [119.0]])]))])]
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
