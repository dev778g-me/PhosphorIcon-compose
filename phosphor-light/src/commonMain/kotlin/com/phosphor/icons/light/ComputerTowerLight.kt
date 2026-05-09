package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ComputerTowerLight: ImageVector
    get() {
        if (_ComputerTowerLight != null) {
            return _ComputerTowerLight!!
        }
        _ComputerTowerLight = ImageVector.Builder(
            name = "Light.ComputerTowerLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 72f)
                lineTo(96f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 104f)
                lineTo(96f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 40f)
                lineTo(200f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 224f)
                lineTo(64f, 224f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 216f)
                lineTo(56f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 32f)
                lineTo(192f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 40f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 180f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
        }.build()

        return _ComputerTowerLight!!
    }

@Suppress("ObjectPropertyName")
private var _ComputerTowerLight: ImageVector? = null
