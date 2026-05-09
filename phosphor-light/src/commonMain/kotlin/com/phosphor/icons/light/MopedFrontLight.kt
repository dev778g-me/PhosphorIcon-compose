package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MopedFrontLight: ImageVector
    get() {
        if (_MopedFrontLight != null) {
            return _MopedFrontLight!!
        }
        _MopedFrontLight = ImageVector.Builder(
            name = "Light.MopedFrontLight",
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
                moveTo(128f, 144f)
                lineTo(128f, 144f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 168f)
                lineTo(152f, 216f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 240f)
                lineTo(128f, 240f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                lineTo(104f, 168f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 48f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 48f)
                lineTo(208f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 48f)
                lineTo(96f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 208f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(136f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(152f)
            }
        }.build()

        return _MopedFrontLight!!
    }

@Suppress("ObjectPropertyName")
private var _MopedFrontLight: ImageVector? = null
