  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v2: Double = v1
    let v10: [Double] = [v2, v1, v2, v1, v1, v2, v2]
    let v11: Double = v10[4]
    let v27: Double = v11 + v2
    var v31: [Double] = v10
    v31 = v10
    v31[1] = v2
    let v35: Double = v31[1]
    var v26: [Double] = v31
    v31[2] = v11
    let v72: Double = v27 / v35
    let v44: Double = v26[0]
    v31[3] = v35
    v2 = v72
    return v44
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], p1: [[s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]]), s1(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], p1: [[s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])], [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]])]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
