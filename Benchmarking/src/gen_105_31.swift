  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s2]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s3], _ v2: Double) -> Double {
    let v4: Double = v2 / v2
    let v5: s3 = v1[0]
    let v8: s2 = v5.p1
    let v6: [s0] = v8.p0
    var v12: Double = v2
    let v33: s0 = v6[1]
    let v31: [[Double]] = v33.p0
    let v28: Double = v12 * v4
    let v40: [Double] = v31[0]
    let v44: Double = v28 * v2
    let v61: Double = v40[0]
    let v77: Double = v61 / v44
    return v77
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])])], p1: s2(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])], p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]])]))
    let v1: [s3] = [s3(p0: [s2(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])], p1: [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])])], p1: s2(p0: [s0(p0: [[45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]])], p1: [s0(p0: [[54.0], [55.0]], p1: [[56.0]]), s0(p0: [[57.0], [58.0]], p1: [[59.0]])]))]
    let v2: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
