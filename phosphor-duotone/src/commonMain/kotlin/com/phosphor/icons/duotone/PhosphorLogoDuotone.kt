package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PhosphorLogoDuotone: ImageVector
    get() {
        if (_PhosphorLogoDuotone != null) {
            return _PhosphorLogoDuotone!!
        }
        _PhosphorLogoDuotone = ImageVector.Builder(
            name = "Duotone.PhosphorLogoDuotone",
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
                moveTo(144f, 168f)
                horizontalLineToRelative(8f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -128f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(144f, 168f)
                lineToRelative(-72f, 0f)
                lineToRelative(0f, -128f)
                lineToRelative(72f, 128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 168f)
                verticalLineToRelative(72f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, -72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                lineTo(144f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 168f)
                horizontalLineToRelative(8f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -128f)
                horizontalLineToRelative(-8f)
            }
        }.build()

        return _PhosphorLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PhosphorLogoDuotone: ImageVector? = null
