package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.HandDuotone: ImageVector
    get() {
        if (_HandDuotone != null) {
            return _HandDuotone!!
        }
        _HandDuotone = ImageVector.Builder(
            name = "Duotone.HandDuotone",
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
                moveTo(188f, 56f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, 20f)
                verticalLineTo(44f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                verticalLineTo(60f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                verticalLineToRelative(92f)
                lineTo(69.32f, 122f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34.64f, 20f)
                curveToRelative(32.57f, 68.72f, 49.14f, 90f, 93.32f, 90f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, -80f)
                verticalLineTo(76f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 76f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                verticalLineToRelative(76f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                curveToRelative(-44.18f, 0f, -60.75f, -21.28f, -93.32f, -90f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                lineTo(88f, 152f)
                verticalLineTo(60f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                verticalLineTo(44f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                verticalLineToRelative(76f)
            }
        }.build()

        return _HandDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HandDuotone: ImageVector? = null
