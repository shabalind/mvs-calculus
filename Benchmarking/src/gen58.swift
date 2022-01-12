  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [[s1]]
  }
  struct s3 {
    var p0: [s2]
    var p1: s1
  }
  func f45(_ v0: s3) -> s3 {
    let v1: s1 = v0.p1
    let v10: [[s0]] = v1.p0
    let v12: [[s0]] = v1.p0
    let v7: [s0] = v10[0]
    var v14: [[s0]] = v12
    let v8: [s0] = v10[0]
    let v6: [s0] = v1.p1
    var v16: [s0] = v6
    v14[0] = v8
    var v22: s1 = v1
    let v26: [s0] = v1.p1
    let v21: [s0] = v22.p1
    v22.p1 = v26
    v22.p0 = v14
    v22.p0 = v14
    v14[0] = v7
    v22.p1 = v16
    var v123: s3 = v0
    let v38: [s0] = v14[0]
    v22.p0 = v12
    v14[0] = v38
    v22.p1 = v21
    v123.p1 = v22
    var v263: s3 = v123
    return v263
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v4: s3 = f45(v0)
    var v6: Double = v1
    let v7: s1 = v4.p1
    let v26: [[s0]] = v7.p0
    let v21: [s0] = v26[0]
    let v29: s0 = v21[0]
    let v31: [[Double]] = v29.p2
    let v62: [Double] = v31[0]
    var v51: [Double] = v62
    let v68: Double = v51[0]
    let v41: Double = v6 * v68
    v51[0] = v1
    return v41
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0]], p2: [[7.0]])], [s0(p0: [[8.0], [9.0]], p1: [[10.0]], p2: [[11.0]])]], p1: [[s1(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]], p2: [[15.0]])]], p1: [s0(p0: [[16.0], [17.0]], p1: [[18.0]], p2: [[19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0]], p2: [[23.0]])])]]), s2(p0: [[s0(p0: [[24.0], [25.0]], p1: [[26.0]], p2: [[27.0]])], [s0(p0: [[28.0], [29.0]], p1: [[30.0]], p2: [[31.0]])], [s0(p0: [[32.0], [33.0]], p1: [[34.0]], p2: [[35.0]])]], p1: [[s1(p0: [[s0(p0: [[36.0], [37.0]], p1: [[38.0]], p2: [[39.0]])]], p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0]], p2: [[43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0]], p2: [[47.0]])])]]), s2(p0: [[s0(p0: [[48.0], [49.0]], p1: [[50.0]], p2: [[51.0]])], [s0(p0: [[52.0], [53.0]], p1: [[54.0]], p2: [[55.0]])], [s0(p0: [[56.0], [57.0]], p1: [[58.0]], p2: [[59.0]])]], p1: [[s1(p0: [[s0(p0: [[60.0], [61.0]], p1: [[62.0]], p2: [[63.0]])]], p1: [s0(p0: [[64.0], [65.0]], p1: [[66.0]], p2: [[67.0]]), s0(p0: [[68.0], [69.0]], p1: [[70.0]], p2: [[71.0]])])]])], p1: s1(p0: [[s0(p0: [[72.0], [73.0]], p1: [[74.0]], p2: [[75.0]])]], p1: [s0(p0: [[76.0], [77.0]], p1: [[78.0]], p2: [[79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0]], p2: [[83.0]])]))
    let v1: Double = 84.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 84.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
