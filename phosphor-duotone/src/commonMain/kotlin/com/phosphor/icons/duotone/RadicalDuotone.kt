package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.RadicalDuotone: ImageVector
    get() {
        if (_RadicalDuotone != null) {
            return _RadicalDuotone!!
        }
        _RadicalDuotone = ImageVector.Builder(
            name = "Duotone.RadicalDuotone",
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
                moveTo(32f, 80f)
                horizontalLineTo(240f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                verticalLineTo(192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(80f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 104f)
                lineToRelative(0f, -24f)
                lineToRelative(-112f, 0f)
                lineToRelative(-48f, 128f)
                lineToRelative(-48f, -128f)
            }
        }.build()

        return _RadicalDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RadicalDuotone: ImageVector? = null
