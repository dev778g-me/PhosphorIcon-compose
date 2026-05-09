package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BlueprintLight: ImageVector
    get() {
        if (_BlueprintLight != null) {
            return _BlueprintLight!!
        }
        _BlueprintLight = ImageVector.Builder(
            name = "Light.BlueprintLight",
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
                moveTo(24f, 176f)
                verticalLineTo(64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                horizontalLineTo(64f)
                verticalLineTo(152f)
                horizontalLineTo(48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 48f)
                horizontalLineTo(232f)
                verticalLineTo(64f)
                horizontalLineTo(64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineTo(128f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 96f)
                lineTo(168f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 112f)
                lineTo(192f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 144f)
                lineTo(192f, 144f)
            }
        }.build()

        return _BlueprintLight!!
    }

@Suppress("ObjectPropertyName")
private var _BlueprintLight: ImageVector? = null
