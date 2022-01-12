  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
    var p6: [Double]
  }
  struct s3 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f23(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v0
    var v3: Double = v7
    var v4: Double = v3
    let v2: Double = v3 - v4
    let v5: [Double] = [v6]
    var v10: Double = v6
    let v17: Double = v5[0]
    var v12: [Double] = v5
    let v32: Double = v12[0]
    var v14: [Double] = v5
    let v19: Double = v5[0]
    var v22: [Double] = v14
    let v18: Double = v0 * v17
    v22 = v12
    var v71: [Double] = v12
    var v21: [Double] = v5
    v21 = v5
    v71[0] = v0
    let v41: Double = v71[0]
    let v16: Double = v14[0]
    let v24: Double = v14[0]
    let v23: Double = v71[0]
    var v35: Double = v23
    v12[0] = v17
    v12[0] = v16
    v22[0] = v35
    var v28: [Double] = v14
    var v53: [Double] = v21
    var v47: [Double] = v12
    var v30: [Double] = v28
    var v50: [Double] = v12
    v14[0] = v19
    v14[0] = v10
    let v51: Double = v30[0]
    v22[0] = v41
    let v59: Double = v71[0]
    let v78: Double = v71[0]
    v14 = v50
    var v31: [Double] = v47
    let v95: Double = v28[0]
    v22[0] = v24
    var v205: [Double] = v28
    var v46: [Double] = v50
    v50[0] = v59
    v14[0] = v32
    v14[0] = v51
    var v55: Double = v78
    let v103: Double = v31[0]
    v47[0] = v95
    let v44: [[Double]] = [v50, v205, v53, v28]
    let v52: [Double] = v44[0]
    v46[0] = v18
    v30[0] = v103
    let v104: Double = v31[0]
    v22[0] = v4
    v28[0] = v24
    var v176: [Double] = v52
    v50[0] = v2
    v21[0] = v104
    let v278: Double = v46[0]
    v46[0] = v41
    let v144: Double = v22[0]
    let v141: Double = v176[0]
    var v54: Double = v55
    v53[0] = v278
    let v215: Double = v22[0]
    v28[0] = v54
    v47[0] = v144
    v71[0] = v215
    return v141
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v8: Double = f23(v1)
    let v7: Double = f23(v8)
    var v11: Double = v8
    let v9: [Double] = [v7, v11]
    let v20: Double = v9[1]
    let v38: Double = v7 - v20
    return v38
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0], [7.0]], p3: [[8.0], [9.0], [10.0]], p4: [[11.0], [12.0], [13.0]], p5: [[14.0]], p6: [15.0, 16.0])], [s0(p0: [[17.0], [18.0]], p1: [[19.0], [20.0], [21.0]], p2: [[22.0], [23.0], [24.0]], p3: [[25.0], [26.0], [27.0]], p4: [[28.0], [29.0], [30.0]], p5: [[31.0]], p6: [32.0, 33.0])], [s0(p0: [[34.0], [35.0]], p1: [[36.0], [37.0], [38.0]], p2: [[39.0], [40.0], [41.0]], p3: [[42.0], [43.0], [44.0]], p4: [[45.0], [46.0], [47.0]], p5: [[48.0]], p6: [49.0, 50.0])]], p1: [s0(p0: [[51.0], [52.0]], p1: [[53.0], [54.0], [55.0]], p2: [[56.0], [57.0], [58.0]], p3: [[59.0], [60.0], [61.0]], p4: [[62.0], [63.0], [64.0]], p5: [[65.0]], p6: [66.0, 67.0]), s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0], [72.0]], p2: [[73.0], [74.0], [75.0]], p3: [[76.0], [77.0], [78.0]], p4: [[79.0], [80.0], [81.0]], p5: [[82.0]], p6: [83.0, 84.0]), s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]], p2: [[90.0], [91.0], [92.0]], p3: [[93.0], [94.0], [95.0]], p4: [[96.0], [97.0], [98.0]], p5: [[99.0]], p6: [100.0, 101.0])])
    let v1: Double = 102.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 102.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
