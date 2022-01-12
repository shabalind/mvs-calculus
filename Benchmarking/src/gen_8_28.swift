  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s2 {
    var p0: s1
  }
  struct s3 {
    var p0: s1
    var p1: [[s0]]
  }
  func f9(_ v0: s1) -> s1 {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [s2], _ v2: [s3], _ v3: Double) -> Double {
    let v11: s1 = v0[0]
    let v23: s1 = f9(v11)
    let v7: s1 = f9(v23)
    let v18: [s0] = v7.p0
    let v17: s0 = v18[0]
    let v46: [[Double]] = v17.p1
    let v35: [Double] = v46[0]
    let v87: Double = v35[0]
    return v87
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]), s1(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])]
    let v1: [s2] = [s2(p0: s1(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]))]
    let v2: [s3] = [s3(p0: s1(p0: [s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]), p1: [[s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])], [s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]])], [s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]])]])]
    let v3: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
