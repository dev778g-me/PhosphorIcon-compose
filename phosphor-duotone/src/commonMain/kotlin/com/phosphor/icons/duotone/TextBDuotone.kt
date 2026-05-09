package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TextBDuotone: ImageVector
    get() {
        if (_TextBDuotone != null) {
            return _TextBDuotone!!
        }
        _TextBDuotone = ImageVector.Builder(
            name = "Duotone.TextBDuotone",
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
                moveTo(160f, 120f)
                horizontalLineTo(148f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -72f)
                horizontalLineTo(80f)
                verticalLineTo(200f)
                horizontalLineToRelative(80f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 120f)
                horizontalLineToRelative(80f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 80f)
                horizontalLineTo(80f)
                verticalLineTo(48f)
                horizontalLineToRelative(68f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72f)
            }
        }.build()

        return _TextBDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TextBDuotone: ImageVector? = null
