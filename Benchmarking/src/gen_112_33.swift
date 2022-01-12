  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s6 {
    var p0: s0
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    var v3: Double = v1
    let v7: s6 = v0[0]
    let v11: s0 = v7.p0
    let v5: [[Double]] = v11.p0
    let v13: Double = v1 + v3
    let v23: [Double] = v5[0]
    let v35: Double = v3 / v13
    let v52: Double = v13 - v1
    let v50: Double = v23[0]
    let v55: [Double] = [v3, v50, v35, v50, v35, v35, v52]
    let v86: Double = v55[4]
    return v86
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s3(p0: s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))), s6(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: s3(p0: s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])), p1: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]))), s6(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]), p1: s3(p0: s1(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])), p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]])))]
    let v1: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
