  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s1]
  }
  func f3(_ v0: Double) -> Double {
    var v5: Double = v0
    var v19: Double = v5
    var v9: Double = v19
    var v18: Double = v9
    return v18
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v3: [Double] = [v1, v1, v1, v1]
    let v4: Double = v3[1]
    let v10: Double = f3(v4)
    let v16: Double = f3(v10)
    let v21: Double = f3(v16)
    var v35: Double = v10
    let v70: Double = v21 / v35
    var v41: Double = v70
    let v120: Double = v41 - v10
    return v120
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), p1: [s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])], p1: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])]), s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]])], p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]])]), s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])], p1: [s0(p0: [[42.0], [43.0]], p1: [[44.0]]), s0(p0: [[45.0], [46.0]], p1: [[47.0]])])]), s3(p0: s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]])], p1: [s0(p0: [[54.0], [55.0]], p1: [[56.0]]), s0(p0: [[57.0], [58.0]], p1: [[59.0]])]), p1: [s1(p0: [s0(p0: [[60.0], [61.0]], p1: [[62.0]]), s0(p0: [[63.0], [64.0]], p1: [[65.0]])], p1: [s0(p0: [[66.0], [67.0]], p1: [[68.0]]), s0(p0: [[69.0], [70.0]], p1: [[71.0]])]), s1(p0: [s0(p0: [[72.0], [73.0]], p1: [[74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0]])], p1: [s0(p0: [[78.0], [79.0]], p1: [[80.0]]), s0(p0: [[81.0], [82.0]], p1: [[83.0]])]), s1(p0: [s0(p0: [[84.0], [85.0]], p1: [[86.0]]), s0(p0: [[87.0], [88.0]], p1: [[89.0]])], p1: [s0(p0: [[90.0], [91.0]], p1: [[92.0]]), s0(p0: [[93.0], [94.0]], p1: [[95.0]])])])]
    let v1: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
