package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.PhosphorLogo: ImageVector
    get() {
        if (_PhosphorLogo != null) {
            return _PhosphorLogo!!
        }
        _PhosphorLogo = ImageVector.Builder(
            name = "Regular.PhosphorLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
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

        return _PhosphorLogo!!
    }

@Suppress("ObjectPropertyName")
private var _PhosphorLogo: ImageVector? = null
