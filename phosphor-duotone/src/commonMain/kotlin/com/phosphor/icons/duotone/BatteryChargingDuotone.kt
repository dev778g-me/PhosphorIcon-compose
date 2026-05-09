package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BatteryChargingDuotone: ImageVector
    get() {
        if (_BatteryChargingDuotone != null) {
            return _BatteryChargingDuotone!!
        }
        _BatteryChargingDuotone = ImageVector.Builder(
            name = "Duotone.BatteryChargingDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(32f, 64f)
                lineTo(200f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 80f)
                lineTo(216f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 192f)
                lineTo(32f, 192f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 176f)
                lineTo(16f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 64f)
                lineTo(200f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 80f)
                lineTo(216f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 192f)
                lineTo(32f, 192f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 176f)
                lineTo(16f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(248f, 96f)
                lineTo(248f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116f, 160f)
                lineToRelative(16f, -32f)
                lineToRelative(-32f, 0f)
                lineToRelative(16f, -32f)
            }
        }.build()

        return _BatteryChargingDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingDuotone: ImageVector? = null
