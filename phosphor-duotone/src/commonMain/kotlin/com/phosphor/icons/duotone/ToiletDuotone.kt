package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ToiletDuotone: ImageVector
    get() {
        if (_ToiletDuotone != null) {
            return _ToiletDuotone!!
        }
        _ToiletDuotone = ImageVector.Builder(
            name = "Duotone.ToiletDuotone",
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
                moveTo(163.58f, 192.51f)
                horizontalLineToRelative(0f)
                arcToRelative(88.21f, 88.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -71.14f, 0f)
                horizontalLineToRelative(0f)
                lineToRelative(-4.34f, 30.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 232f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.92f, -9.13f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(64f, 112f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 112f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 64f)
                lineTo(112f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 112f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -176f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92.42f, 192.51f)
                lineToRelative(-4.34f, 30.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 232f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.92f, -9.13f)
                lineToRelative(-4.34f, -30.36f)
            }
        }.build()

        return _ToiletDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletDuotone: ImageVector? = null
