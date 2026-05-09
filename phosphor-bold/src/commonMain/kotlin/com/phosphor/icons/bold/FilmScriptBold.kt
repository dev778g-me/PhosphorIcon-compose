package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FilmScriptBold: ImageVector
    get() {
        if (_FilmScriptBold != null) {
            return _FilmScriptBold!!
        }
        _FilmScriptBold = ImageVector.Builder(
            name = "Bold.FilmScriptBold",
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
                moveTo(56f, 32f)
                lineTo(200f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 40f)
                lineTo(208f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 224f)
                lineTo(56f, 224f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 216f)
                lineTo(48f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 80f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 176f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 128f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
        }.build()

        return _FilmScriptBold!!
    }

@Suppress("ObjectPropertyName")
private var _FilmScriptBold: ImageVector? = null
