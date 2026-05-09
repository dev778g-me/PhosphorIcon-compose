package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CursorTextLight: ImageVector
    get() {
        if (_CursorTextLight != null) {
            return _CursorTextLight!!
        }
        _CursorTextLight = ImageVector.Builder(
            name = "Light.CursorTextLight",
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
                moveTo(128f, 80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 208f)
                horizontalLineTo(160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 208f)
                horizontalLineTo(96f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                verticalLineTo(80f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 48f)
                horizontalLineTo(80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 128f)
                lineTo(152f, 128f)
            }
        }.build()

        return _CursorTextLight!!
    }

@Suppress("ObjectPropertyName")
private var _CursorTextLight: ImageVector? = null
