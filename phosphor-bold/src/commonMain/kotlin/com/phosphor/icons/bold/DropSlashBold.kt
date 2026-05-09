package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DropSlashBold: ImageVector
    get() {
        if (_DropSlashBold != null) {
            return _DropSlashBold!!
        }
        _DropSlashBold = ImageVector.Builder(
            name = "Bold.DropSlashBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74.9f, 69.59f)
                curveTo(60.11f, 90.4f, 48f, 116f, 48f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 141.29f, 51.42f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(207.16f, 155.61f)
                arcTo(80.84f, 80.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                curveToRelative(0f, -72f, -80f, -128f, -80f, -128f)
                arcToRelative(233.87f, 233.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26.84f, 23f)
            }
        }.build()

        return _DropSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _DropSlashBold: ImageVector? = null
